package com.example.Examen.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Examen.model.Client;
import com.example.Examen.model.Shipment;

@Repository
public interface ShipmentRepository  extends  CrudRepository<Shipment, Long>{

	Optional<Client> findByClientId(Long id);
	
	Optional<Product>
}
