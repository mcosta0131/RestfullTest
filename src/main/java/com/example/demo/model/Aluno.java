package com.example.demo.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "aluno")
public class Aluno {
	
	
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 4175393554278686985L;

	@Id
	private ObjectId id;

	@JsonProperty("matricula")
	private Long matricula;

	@JsonProperty("nome")
	private String nome;

	@JsonProperty("idade")
	private int idade;

	public Aluno(ObjectId id, Long matricula, String nome, int idade) {
		this.id = id;
		this.matricula = matricula;
		this.nome = nome;
		this.idade = idade;
	}

	public ObjectId getId() {
		return id;
	}

	public long getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
