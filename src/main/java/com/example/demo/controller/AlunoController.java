package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Aluno;
import com.example.demo.repository.AlunoRepository;

@RestController
public class AlunoController {

	@Autowired
	AlunoRepository repository;

	@GetMapping("/buscaPorMatricula")
	public Aluno buscaAluno(@RequestParam Long matricula) {
		Aluno x = repository.findByMatricula(matricula);
		return x;
	}

	@GetMapping("/buscaPorNome")
	public List<Aluno> buscaNome(@RequestBody Aluno aluno) {
		return repository.findByNome(aluno.getNome());
	}
	
	@GetMapping("/buscaTodos")
	public List<Aluno> buscaTodos(@RequestBody Aluno aluno) {
		return repository.findAll();
	}

	@PostMapping("/insereAluno")
	public Aluno insereAluno(@RequestBody Aluno aluno) {
		return repository.save(aluno);
	}
	
	@DeleteMapping("/deleteAluno")
	public String deleteAluno(@RequestBody Aluno aluno) {
		
		 this.repository.deleteAlunoByMatricula(aluno.getMatricula());
		 return "Aluno excluido com sucesso !!";
	}

}
