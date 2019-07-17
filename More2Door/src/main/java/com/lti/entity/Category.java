package com.lti.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_CATEGORY")
public class Category {

	@Id
	@GeneratedValue
	@Column(name="CAT_ID")
	private int catId;
	
	@Column(name="CAT_NAME")
	private String catName;
	
	@Column(name="CAT_LUPDATE")
	private Date catLupdate;
	
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public Date getCatLupdate() {
		return catLupdate;
	}
	public void setCatLupdate(Date catLupdate) {
		this.catLupdate = catLupdate;
	}
	
}
