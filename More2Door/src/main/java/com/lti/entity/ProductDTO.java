package com.lti.entity;



import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class ProductDTO {
	private int prodId;
	private String prodBrand;
	private String prodDesc;
	
	private int prodQty;
	private double prodPrice;
	
	private int prodCategory;
	private String prodLupdate;
	private int userId;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getProdLupdate() {
		return prodLupdate;
	}
	public void setProdLupdate(String prodLupdate) {
		this.prodLupdate = prodLupdate;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
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
		public MultipartFile getProductPic() {
		return productPic;
	}
	public void setProductPic(MultipartFile productPic) {
		this.productPic = productPic;
	}
	private MultipartFile productPic;
	public int getProdCategory() {
		return prodCategory;
	}
	public void setProdCategory(int prodCategory) {
		this.prodCategory = prodCategory;
	}
	

}
