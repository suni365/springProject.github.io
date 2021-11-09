package com.captal.account.dto;


public class OrderRequest {
	
	private String cname ;  
	
	private int clintId; 
	private int cPhone ;  
	private int pid; 
	private double credit;
	private double debit;
	private String particular;
	
	
	public OrderRequest(String cname, int clintId, int cPhone, int pid, double credit, double debit,
			String particular) {
		
		this.cname = cname;
		this.clintId = clintId;
		this.cPhone = cPhone;
		this.pid = pid;
		this.credit = credit;
		this.debit = debit;
		this.particular = particular;
	}


	public OrderRequest() {
	
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public int getClintId() {
		return clintId;
	}


	public void setClintId(int clintId) {
		this.clintId = clintId;
	}


	public int getcPhone() {
		return cPhone;
	}


	public void setcPhone(int cPhone) {
		this.cPhone = cPhone;
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public double getCredit() {
		return credit;
	}


	public void setCredit(double credit) {
		this.credit = credit;
	}


	public double getDebit() {
		return debit;
	}


	public void setDebit(double debit) {
		this.debit = debit;
	}


	public String getParticular() {
		return particular;
	}


	public void setParticular(String particular) {
		this.particular = particular;
	}
	
	
    
	
	
	
	
	}



	
	
	


