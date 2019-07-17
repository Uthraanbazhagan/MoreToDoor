package com.lti.entity;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="TBL_CART")
	public class MyCart {
		
		@Id
		@Column(name="CART_ID")
		private int cartId;
		@Column(name="CUST_ID")
		private int custId;
		@Column(name="PROD_ID")
		private String prodId;
		@Column(name="CART_QTY")
		private int qty;
		public int getCartId() {
			return cartId;
		}
		public void setCartId(int cartId) {
			this.cartId = cartId;
		}
		public int getCustId() {
			return custId;
		}
		public void setCustId(int custId) {
			this.custId = custId;
		}
		public String getProdId() {
			return prodId;
		}
		public void setProdId(String prodId) {
			this.prodId = prodId;
		}
		public int getQty() {
			return qty;
		}
		public void setQty(int qty) {
			this.qty = qty;
		}
		
		}


