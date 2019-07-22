package com.lti.entity;

	import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

	@Entity
	@Table(name="TBL_CART")
	public class MyCart {
		
		@Id
		@Column(name="CART_ID")
		@GeneratedValue
		private int cartId;
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "USER_ID")
		@JsonIgnore
		private User user;
		
		@ManyToOne
		@JoinColumn(name="PROD_ID")
		private Product product;
		
		@Column(name="CART_QTY")
		private int qty;
		
		public int getCartId() {
			return cartId;
		}
		public void setCartId(int cartId) {
			this.cartId = cartId;
		}
		
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public Product getProduct() {
			return product;
		}
		public void setProduct(Product product) {
			this.product = product;
		}
		public int getQty() {
			return qty;
		}
		public void setQty(int qty) {
			this.qty = qty;
		}
		
		}


