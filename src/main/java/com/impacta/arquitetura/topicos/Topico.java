package com.impacta.arquitetura.topicos;

public class Topico {
	private String id;
	private String nome;
	private String descricao;

	public Topico() {

	}

	public Topico(String id, String nome, String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Topico [id=" + id + ", nome=" + nome + ", descricao=" + descricao + "]";
	}
	

}
