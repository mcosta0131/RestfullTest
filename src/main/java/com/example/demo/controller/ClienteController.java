package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cliente;
import com.example.demo.repository.ClienteRepository;

@RestController
public class ClienteController {

	@Autowired
	ClienteRepository repository;
	
	
	@PostMapping("/insereCliente")
	public Cliente insereAluno(@RequestBody Cliente cliente) {
		return repository.save(cliente);
	}
}
