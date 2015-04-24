package com.action;

import com.vo.productVo;

public class productAction {
	
	
	private String nameString;
	
	private String idString;
	
	private String descString;
	
	
	public String getNameString() {
		return nameString;
	}


	public void setNameString(String nameString) {
		this.nameString = nameString;
	}


	public String getIdString() {
		return idString;
	}


	public void setIdString(String idString) {
		this.idString = idString;
	}


	public String getDescString() {
		return descString;
	}


	public void setDescString(String descString) {
		this.descString = descString;
	}


//	private productVo product;
//	
//	
//	public productVo getProduct() {
//		return product;
//	}
//
//
//	public void setProduct(productVo product) {
//		this.product = product;
//	}


	public String save(){
		return "details";
	}
	
	public String testTag(){
		this.descString = "testkkk";
		this.idString = "xxxxx";
		this.nameString = "wuwu";
		return "success";
	}

}
