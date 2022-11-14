package com.restfulapi.ecommerce.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name = "tbladdress")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "number")
	private String number;
	
	@Column(name = "street")
	private String street;
	
	@Column(name = "district")
	private String district;
	
	@Column(name = "ward")
	private String ward;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "description")
	private String description;
	

	@OneToOne(mappedBy = "address")
	private Customer customer;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address( String number, String street, String district, String ward, String city,
			String decripsiton) {
		super();
		this.number = number;
		this.street = street;
		this.district = district;
		this.ward = ward;
		this.city = city;
		this.description = decripsiton;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getWard() {
		return ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDecripsiton() {
		return description;
	}

	public void setDecripsiton(String decripsiton) {
		this.description = decripsiton;
	}

}
