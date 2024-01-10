package com.hibernate.read.fatch.Rani;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rani {
	@Id
	private int rId;
	private String rName;
	private String rSal;
	private String rLanguage;
	
	public int getrId() {
		return rId;
	}
	public void setrId(int rId) {
		this.rId = rId;
	}
	public String getrName() {
		return rName;
	}
	public void setrName(String rName) {
		this.rName = rName;
	}
	public String getrSal() {
		return rSal;
	}
	public void setrSal(String rSal) {
		this.rSal = rSal;
	}
	public String getrLanguage() {
		return rLanguage;
	}
	public void setrLanguage(String rLanguage) {
		this.rLanguage = rLanguage;
	}
	@Override
	public String toString() {
		return "Rani [rId=" + rId + ", rName=" + rName + ", rSal=" + rSal + ", rLanguage=" + rLanguage + "]";
	}
	

}
