package com.example.demo.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, ObjectId>{

}
