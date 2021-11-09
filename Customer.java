	package com.captal.account.Model;

import com.captal.account.Model.*;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import org.springframework.data.jpa.domain.AbstractPersistable;



@Entity
@Table (name="Customer") 
public class Customer implements Serializable {

	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int clintId;
	
	@Column(name="companyName" ,length = 45)
	private String cname;
	
	@Column(name="companyPhone")
	private int cPhone;
	
	@Column(name="cemail")
	private String cemail;
	
	@Column(name="houseNo")
	private String houseNo;
	
	@Column(name="street")
	private String Street;
	
	@Column(name="landmark")
	private String Landmark;
	
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="pincode")
	private int pincode;
    
	
	@OneToMany(targetEntity=Product.class,fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="newColumn",referencedColumnName="clintId")
	private List<Product> products = new ArrayList<>();


	
	
	
	
	

	public int getClintId() {
		return clintId;
	}


	public void setClintId(int clintId) {
		this.clintId = clintId;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public int getcPhone() {
		return cPhone;
	}


	public void setcPhone(int cPhone) {
		this.cPhone = cPhone;
	}


	public String getCemail() {
		return cemail;
	}


	public void setCemail(String cemail) {
		this.cemail = cemail;
	}


	public String getHouseNo() {
		return houseNo;
	}


	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}


	public String getStreet() {
		return Street;
	}


	public void setStreet(String street) {
		Street = street;
	}


	public String getLandmark() {
		return Landmark;
	}


	public void setLandmark(String landmark) {
		Landmark = landmark;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	public List<Product> getProducts() {
		return products;
	}


	public void setProducts(List<Product> products) {
		this.products = products;
	}


	public Customer() {
		
	}


	public Customer(int clintId, String cname, int cPhone, String cemail, String houseNo, String street,
			String landmark, String city, String state, int pincode, List<Product> products) {
		
		this.clintId = clintId;
		this.cname = cname;
		this.cPhone = cPhone;
		this.cemail = cemail;
		this.houseNo = houseNo;
		Street = street;
		Landmark = landmark;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.products = products;
	}


	
	
	
	
	

	
	
	

	
	
	
	


}



