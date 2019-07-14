package com.lti.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TBL_PRODUCT")
public class Product {
@Id
@Column(name="PROD_ID")
@GeneratedValue
private String prodId;
@Column(name="PROD_BRAND")
private String prodBrand;
@Column(name="PROD_DESC")
private String prodDesc;
@Column(name="PROD_QTY")
private int prodQty;
@Column(name="PROD_PRICE")
private double prodPrice;
private String prodPicFilename;
@Column(name="CAT_ID")
private int catId;

public String getProdPicFilename() {
	return prodPicFilename;
}

public void setProdPicFilenme(String prodPicFilename) {
	this.prodPicFilename = prodPicFilename;
}

public String getProdId() {
	return prodId;
}

public void setProdId(String prodId) {
	this.prodId = prodId;
}

public String getProdBrand() {
	return prodBrand;
}

public void setProdBrand(String prodBrand) {
	this.prodBrand = prodBrand;
}

public String getProdDesc() {
	return prodDesc;
}

public void setProdDesc(String prodDesc) {
	this.prodDesc = prodDesc;
}

public int getProdQty() {
	return prodQty;
}

public void setProdQty(int prodQty) {
	this.prodQty = prodQty;
}

public double getProdPrice() {
	return prodPrice;
}

public void setProdPrice(double prodPrice) {
	this.prodPrice = prodPrice;
}

public Date getProdLupdate() {
	return prodLupdate;
}

public void setProdLupdate(Date prodLupdate) {
	this.prodLupdate = prodLupdate;
}


@Column(name="PROD_LUPDATE")
private Date prodLupdate;



}
