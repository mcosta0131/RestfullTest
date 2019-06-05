package com.example.demo.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "cliente")
public class Cliente {

	@Id
	private ObjectId id;

	@JsonProperty("nome")
	private String nome;

	@JsonProperty("sobreNome")
	private String sobreNome;

	private ObjectId getId() {
		return id;
	}

	private String getNome() {
		return nome;
	}

	private String getSobreNome() {
		return sobreNome;
	}

	private void setId(ObjectId id) {
		this.id = id;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

}
