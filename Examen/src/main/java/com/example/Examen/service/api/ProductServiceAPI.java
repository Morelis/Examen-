package com.example.Examen.service.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Examen.model.Product; 
import com.example.Examen.repository.ProductRepository;

@Service           
public class ProductServiceAPI {
	// Crear metodos para el guardado y busqueda y todo eso 
	
    @Autowired
	public  ProductRepository productRepository;
	
	public Product save(Product product){
		return productRepository.save(product);
		
	}
	
	public List<Product> productList(){
		return  (List<Product>) productRepository.findAll();
	}
	
	public void delete(Product product){
		productRepository.delete(product);
		
	}
	
	public Optional<Product> findById(Long id){
		return productRepository.findById(id);
		
	}

}
