package com.br.laudo.maker.back.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Produto {

	@JsonProperty("nome")
	public String nome;
	@JsonProperty("cpf")
	public String cpf;
	
	@JsonProperty("nome")
	public String getNome() {
		return nome;
	}

	@JsonProperty("nome")
	public void setNome(String nome) {
		this.nome = nome;
	}

	@JsonProperty("cpf")
	public String getCpf() {
		return cpf;
	}

	@JsonProperty("cpf")
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
