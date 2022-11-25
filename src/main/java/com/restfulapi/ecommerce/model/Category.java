package com.restfulapi.ecommerce.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name ="tblcategory")
public class Category implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1992504412561462035L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name= "description")
	private String description;
	
	@Column(name ="image")
	private String image;
	
	@JsonIgnore
	@OneToMany(mappedBy = "category",targetEntity = Item.class)
	private List<Item> items;

	public Category() {
		super();
		this.items = new ArrayList<Item>();
	}

	public Category(String name, String description, String image) {
		super();
		this.name = name;
		this.description = description;
		this.image = image;
		this.items = new ArrayList<Item>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	
}
