package com.impacta.arquitetura.topicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicosController {
	@Autowired
	private TopicoService topicoService;

	@RequestMapping("/topicos")
	public List<Topico> obterTodosTopicos() {
		return topicoService.obterTodosTopicos();
	}

	@RequestMapping("/topicos/{id}")
	public Topico obterTopico(@PathVariable String id) {
		return topicoService.obterTopico(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/topicos")
	public void inserirTopico(@RequestBody Topico topico) {
		topicoService.inserirTopico(topico);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topicos/{id}")
	public void atualizarTopico(@RequestBody Topico topico, @PathVariable String id) {
		topicoService.atualizarTopico(id, topico);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/topicos/{id}")
	public void deleteTopico( @PathVariable String id) {
		topicoService.deleteTopico(id);
	}
}
