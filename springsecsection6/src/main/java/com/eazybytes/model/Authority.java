package com.eazybytes.model;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="authorities")
public class Authority {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,generator="native")
	@GenericGenerator(name="native" , strategy = "native")
	private long id;
	
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Authority [id=" + id + ", name=" + name + ", customer=" + customer + "]";
	}

	public Authority(long id, String name, Customer customer) {
		super();
		this.id = id;
		this.name = name;
		this.customer = customer;
	}

	public Authority() {
		super();
	}
	
}
