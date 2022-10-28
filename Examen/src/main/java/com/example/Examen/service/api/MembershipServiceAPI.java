package com.example.Examen.service.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Examen.model.Client;
import com.example.Examen.model.Membership;
import com.example.Examen.model.Product;
import com.example.Examen.repository.MembershipRepository;

@Service
public class MembershipServiceAPI {

	// Crear metodos para el guardado y busqueda y todo eso 
	
	    @Autowired
		public  MembershipRepository membershipRepository;
		
		public Boolean save (Membership membership){
		   Product producto = membership.getProduct();
			Optional<Product> produc = membershipRepository.findByProductId(producto.getId());
			
			if(produc.isEmpty()) {
			   if(producto.getMinPrio() > membership.getPrio()) {
				 membershipRepository.save(membership);
				 return true;
						}
			}
		 		 
			return false;
					}
		
		public List<Membership> getallMembership(){
			return  (List<Membership>) membershipRepository.findAll();
		}
		
		public void delete(Membership membership){
			membershipRepository.delete(membership);
			
		}
		
		public Optional<Membership> findById(Long id){
			return membershipRepository.findById(id);
			
		}
}
