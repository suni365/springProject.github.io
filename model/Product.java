package com.captal.account.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product implements Serializable {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pid")
	private int pid;
	
	@Column(length = 45,nullable = false,unique =true)
	private String particular;
	private double debit;
	private double credit;
	
	
	//@ManyToOne(fetch=FetchType.LAZY,optional=false)
	//@JoinColumn(name="clinetId",nullable=false)
	//private Customer customer;
	
	
	
	
	
	public int getPid() {
		return pid;
	}
	
	


	
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getParticular() {
		return particular;
	}
	public void setParticular(String particular) {
		this.particular = particular;
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
		return "Product [pid=" + pid + ", particular=" + particular + ", debit=" + debit + ", credit=" + credit
				+ ", getPid()=" + getPid() + ", getParticular()=" + getParticular() + ", getDebit()=" + getDebit()
				+ ", getCredit()=" + getCredit() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	public Product() {
		
	}
	public Product(int pid, String particular, double debit, double credit) {
	
		this.pid = pid;
		this.particular = particular;
		this.debit = debit;
		this.credit = credit;
	}



			
	
	
}
