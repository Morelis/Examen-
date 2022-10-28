package com.example.Examen.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Examen.model.Product;

@Repository
public interface ProductRepository  extends  CrudRepository<Product, Long> {

}
