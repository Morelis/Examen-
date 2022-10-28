package com.example.Examen.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//@Table(name ="client")
public class Client implements Serializable{
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	private String lastName;
	private String DNI;
	public List<Shipment> getShipment() {
		return shipment;
	}
	public void setShipment(List<Shipment> shipment) {
		this.shipment = shipment;
	}
	private String email;
	private Date lastDelivery;
	private Date nextRenewal;
	
	@OneToOne(mappedBy = "clients")
	private List<Membership> memberShip;
	
	@OneToMany(mappedBy = "clients")
	private List<Shipment> shipment;
	
	public Client() {
		
	}
	public Client(Long id, String name, String lastName, String dNI, String email, Date lastDelivery,
			Date nextRenewal) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		DNI = dNI;
		this.email = email;
		this.lastDelivery = lastDelivery;
		this.nextRenewal = nextRenewal;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getLastDelivery() {
		return lastDelivery;
	}
	public void setLastDelivery(Date lastDelivery) {
		this.lastDelivery = lastDelivery;
	}
	public Date getNextRenewal() {
		return nextRenewal;
	}
	public void setNextRenewal(Date nextRenewal) {
		this.nextRenewal = nextRenewal;
	}
	public List<Membership> getMemberShip() {
		return memberShip;
	}
	public void setMemberShip(List<Membership> memberShip) {
		this.memberShip = memberShip;
	}
	

}
