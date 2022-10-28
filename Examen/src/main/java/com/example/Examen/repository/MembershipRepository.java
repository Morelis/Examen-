package com.example.Examen.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Examen.model.Client;
import com.example.Examen.model.Membership;
import com.example.Examen.model.Product;

@Repository
public interface MembershipRepository  extends  CrudRepository<Membership, Long> {

	Optional<Product> findByProductId(Long id);
}
