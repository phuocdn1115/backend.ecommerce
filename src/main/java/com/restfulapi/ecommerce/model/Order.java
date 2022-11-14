package com.restfulapi.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.CascadeType;

import lombok.Data;

@Data
@Entity
@Table(name="tblbill")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="totalamount")
	private int totalamount;
	
	@Column(name="totalprice")
	private int totalprice;
	
	@Column(name="createdtime")
	private long createdtime;
	
	@Column(name="payment")
	private String payment;
	
	@Column(name="status")
	private String status;
	
	@Column(name="code")
	private String code;
	
	@Column(name="finalprice")
	private int finalprice;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "id", name = "cart")
	private Cart cart;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTotalamount() {
		return totalamount;
	}

	public void setTotalamount(int totalamount) {
		this.totalamount = totalamount;
	}

	public int getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}

	public long getCreatedtime() {
		return createdtime;
	}

	public void setCreatedtime(long createdtime) {
		this.createdtime = createdtime;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getFinalprice() {
		return finalprice;
	}

	public void setFinalprice(int finalprice) {
		this.finalprice = finalprice;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	
	

}
