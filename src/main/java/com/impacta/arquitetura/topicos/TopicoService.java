package com.impacta.arquitetura.topicos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicoService {
	List<Topico> topicos = new ArrayList<Topico>(
			Arrays.asList(new Topico("spring", "Spring Framework", "Spring Framework Description"),
					new Topico("java", "Core Java", "Core Java Description"),
					new Topico("javascript", "JavaScript", "JavaScript Description")));

	public List<Topico> obterTodosTopicos() {
		return topicos;
	}

	public Topico obterTopico(String id) {
		return topicos.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void inserirTopico(Topico topico) {
		topicos.add(topico);
	}

	public void atualizarTopico(String id, Topico topico) {
		for (int i = 0; i < topicos.size(); i++) {
			Topico t = topicos.get(i);
			if (t.getId().equals(id))
				topicos.set(i, topico);
		}

	}

	public void deleteTopico(String id) {
		topicos.removeIf(t -> t.getId().equals(id));
	}

}
