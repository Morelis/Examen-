package com.example.Examen.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Examen.model.Shipment;
import com.example.Examen.service.api.ShipmentServiceAPI;

@RestController
@RequestMapping(path = "/Shipment")
public class ShipmentController {
	
	@Autowired
	public ShipmentServiceAPI shipmentServiceAPI;
	
	@PostMapping("/Create")
	public String CrearShipment (@RequestBody Shipment shipment) {
		if(shipmentServiceAPI.save(shipment)) {
			return "Shipment Creado";
		
		} else {
			return "Shipment No Creado";
		}
		
	}

}
