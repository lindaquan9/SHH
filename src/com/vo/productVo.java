package com.vo;

public class productVo {
	
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

	@Override
	public String toString() {
		return "product [nameString=" + nameString + ", idString=" + idString
				+ ", descString=" + descString + "]";
	}
	

}
