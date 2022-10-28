package com.example.Examen.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
//@Table(name ="product")
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	public Membership getMembership() {
		return membership;
	}
	public void setMembership(Membership membership) {
		this.membership = membership;
	}
	public String name;
	public BigDecimal cost;
	public int minPrio;
	
	@OneToOne()
	private Membership membership;
	
	public Product() {
		
	}
	public Product(Long id, String name, BigDecimal cost, int minPrio) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.minPrio = minPrio;
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
	public BigDecimal getCost() {
		return cost;
	}
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
	public int getMinPrio() {
		return minPrio;
	}
	public void setMinPrio(int minPrio) {
		this.minPrio = minPrio;
	}
	
	
	
}
