package com.example.Examen.cotroller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.el.ELException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Examen.model.Client;
import com.example.Examen.service.api.ClientServiceAPI;

@RestController
@RequestMapping(path = "/Client")
public class PController  {

	@Autowired ClientServiceAPI clienteServicio;
	
	@PostMapping(value = "/crear")
	private ResponseEntity<Client> guardar (@RequestBody Client client) {
		Client temp = clienteServicio.save(client);
		
		try {
			
			return ResponseEntity.ok(temp);
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			
		}
		   
	}
	
	@GetMapping(value ="/list")
	private ResponseEntity<List<Client>> listarClientes (){
		return ResponseEntity.ok(clienteServicio.getallClient());
	}
	
	
	@DeleteMapping
	private ResponseEntity<Void> eliminarCliente (@RequestBody Client client){
		clienteServicio.delete(client);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping(value = "/{id}")
	private ResponseEntity<Optional<Client>> listarClientePorID (@PathVariable ("id") Long id){
		return ResponseEntity.ok(clienteServicio.findById(id));
	}
}
