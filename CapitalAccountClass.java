package com.captal.account.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CapitalAccountClass {
	
	@Id
	@GeneratedValue
	private int id ;
	private String particulars;
	private double debit; 
	private double credit;
	
	
	
	
	public CapitalAccountClass() {
		
	}
	
	
	
	
	public CapitalAccountClass(String particulars, double debit, double credit) {
		super();
		this.particulars = particulars;
		this.debit = debit;
		this.credit = credit;
	}




	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}
	public double getDebit() {
		return debit;
	}
	public void setDebit(double debit) {
		this.debit = debit;
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}




	@Override
	public String toString() {
		return "CapitalAccountClass [id=" + id + ", particulars=" + particulars + ", debit=" + debit + ", credit="
				+ credit + "]";
	} 
	
	
	

}
