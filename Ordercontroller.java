package com.captal.account.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.captal.account.Dao.CustomerRepo;
import com.captal.account.Dao.ProductRepo;
import com.captal.account.dto.OrderRequest;

import com.captal.account.Model.*;

@RestController

public class Ordercontroller {
	
	
 @Autowired
 private CustomerRepo customerrepo;
  
 //@Autowired 
// private ProductRepo productrepo;
	
 
 
 @RequestMapping(value="suni",method=RequestMethod.GET)
 public String showProduct(Model model)
 {
	 
	 
	 model.addAttribute("customer",customerrepo.findAll());
	
	 return "index1";
			 }
 

 
 
 
 
 
// @PostMapping("/placeOrder")
// public Customer placeOrder(@RequestBody OrderRequest request)
 //{	 
	
	// return customerrepo.save(request.getCustomer());
//}


 //@RequestMapping(value="getalldetails" ,method=RequestMethod.GET)

	// public String displayAllDetails(Model model)
	 //{
	 //model.addAttribute("Customer ", "Product");
	 //model.addAttribute(new Product());
	 //model.addAttribute("customer",customerrepo.findAll());
    	//return "customerdet";
}


