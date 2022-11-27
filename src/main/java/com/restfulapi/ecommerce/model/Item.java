package com.restfulapi.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name ="tblitem")
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private Long price;
	
	@Column(name="unit")
	private String unit;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name ="image")
	private String image;
	
	@Column(name="origin")
	private String origin;
	
	@ManyToOne
	@JoinColumn(name = "category", nullable = false)
	private Category category;

	public Item() {
		super();
	}

	public Item(String name, Long price, String unit, int quantity, Category category, String image, String origin) {
		super();
		this.name = name;
		this.price = price;
		this.unit = unit;
		this.quantity = quantity;
		this.category = category;
		this.image = image;
		this.origin = origin;
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

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	
}
