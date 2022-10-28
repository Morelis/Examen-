package com.example.Examen.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Examen.model.Client;

@Repository
public interface ClientRepository extends  CrudRepository<Client, Long>{

	
} 
