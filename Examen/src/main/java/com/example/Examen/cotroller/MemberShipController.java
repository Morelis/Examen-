package com.example.Examen.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Examen.model.Membership;
import com.example.Examen.model.Shipment;
import com.example.Examen.service.api.MembershipServiceAPI;


public class MemberShipController {

	@Autowired
	public MembershipServiceAPI membershipServiceAPI;
	
	@PostMapping("/Create")
	public String CrearMemberShip (@RequestBody Membership memberShip) {
		if(membershipServiceAPI.save(memberShip)) {
			return "MemberShip Creado";
		
		} else {
			return "MemberShip No Creado";
		}
		
	}
}
