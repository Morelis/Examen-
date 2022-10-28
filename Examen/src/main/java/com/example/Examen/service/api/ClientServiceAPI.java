package com.example.Examen.service.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Examen.model.Client;
import com.example.Examen.repository.ClientRepository;


@Service
public class ClientServiceAPI {

	
	@Autowired
	public ClientRepository clientRepository;
	
	public Client save (Client cliente){
		return clientRepository.save(cliente);
		
	}
	
	public List<Client> getallClient(){
		return  (List<Client>) clientRepository.findAll();
	}
	
	public void delete(Client client){
		clientRepository.delete(client);
		
	}
	
	public Optional<Client> findById(Long id){
		return clientRepository.findById(id);
		
	}
}
