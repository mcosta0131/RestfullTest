package com.example.demo.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Aluno;

public interface AlunoRepository extends MongoRepository<Aluno, ObjectId>{

	Aluno findByMatricula(Long matricula);
	List <Aluno> findByNome(String nome);
	String	deleteAlunoByMatricula (Long matricula);
	
	
	
	 
	
	
}
