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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name ="tblcart")
public class Cart implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="amount")
	private int amount;
	
	@Column(name="totalprice")
	private Long totalPrice;
	
	@Column(name="createdtime")
	private Long createdTime;

	@Column(name="isorder")
	private String isOrder;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cart")
	private List<CartItem> cartItems;
	
	@ManyToOne
	@JoinColumn(name="customer", nullable = false, referencedColumnName = "id")
	private Customer customer;

	@OneToOne(mappedBy = "cart")
	private Order order;

	public Cart() {
		super();
	}

	public Cart(int amount, Long totalPrice, Long createdTime) {
		super();
		this.amount = amount;
		this.totalPrice = totalPrice;
		this.createdTime = createdTime;
		this.isOrder = "no";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Long getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Long totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Long getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Long createdTime) {
		this.createdTime = createdTime;
	}

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getIsOrder() {
		return isOrder;
	}

	public void setIsOrder(String isOrder) {
		this.isOrder = isOrder;
	}

}
