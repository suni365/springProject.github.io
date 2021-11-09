package com.captal.account.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.captal.account.Dao.CapitalAccountRepo;
import com.captal.account.Dao.CustomerRepo;
import com.captal.account.Dao.ProductRepo;
import com.captal.account.Model.CapitalAccountClass;
import com.captal.account.Model.Customer;
import com.captal.account.Model.Product;
//import com.captal.account.dto.OrderRequest;
import com.captal.account.service.CapitalAccountService;


import java.util.List;

import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//mport org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CapitalAccountController {

@Autowired
CapitalAccountService service;

@Autowired 
CapitalAccountRepo repo;


@Autowired
private CustomerRepo customerrepo;

@Autowired 
private ProductRepo productrepo;
	
@RequestMapping({"/hello"})
public String hello()
{
	return "fragments/Topnavnew";
}




//customer details started 
//create new customer 
@GetMapping("/customer/new")
public String showCustomerForm(Model model)
{
   

	model.addAttribute("customer",new Customer());
	
	


	return "Customer_form";
}



//@PostMapping("/customer/new")
//public String processCustomerForm(@ModelAttribute @Valid cust  newCustomer, Errors errors ,@RequestParam int pid ,Model model )
//{
 
 
	
	
	//if(erros.hasErrors())
	//{
		//model.addAttribute("number","Add Customer");
		//model.addAttribute("particular",productrepo.findAll());
		//return "Customer_form";
	//}
	
	
	//Product prod =productrepo.findOne(pid);
	//newProduct.setProduct(prod);
    //customerrepo.save(newProduct);
    //return "redirect:";


	//return "Customer_form";
//}


//save all customer created  

@PostMapping("/customer/save")

public String saveCustomer(Customer customer)
{
	
	
	customerrepo.save(customer);
	
	

	return "redirect:/displayCustomer";
	

}

//display all customers
@GetMapping("/displayCustomer")
public String displayCustomer(Model model)
{
	//List<Customer> listCustomer =customerrepo.findAll();
	
	List<Customer> listCustomer   =customerrepo.findAll();

	List<Product> listparticular  = productrepo.findAll();
	
	

	model.addAttribute("listparticular",listparticular);
	
	
	model.addAttribute("listcustomer",listCustomer);
	


	
	return "customer_join";
}







//product details started 

//creating new product 
@GetMapping("/product")
public String showNewProductForm(Model model)
{
 
	//List<Customer> listCustomer= customerrepo.findAll();
	model.addAttribute("listproduct",new Product());
	
	//model.addAttribute("listcust",listCustomer);

	return "product_form";
}


//saving the cretaed product 

@PostMapping("/products/save")

public String saveProduct(@ModelAttribute("prod") Product product)
{
	productrepo.save(product);
	return "redirect:/join";
}



//displaying the product details 
@GetMapping("/join")
public String showCustomer(Model model)
{
	//List<Customer> listCustomer =customerrepo.findAll();
	
	List<Product> listProduct     =productrepo.findAll();
	

	//model.addAttribute("listCustomer",listCustomer);
	model.addAttribute("listProduct",listProduct);
	

	
	return "cust";
}
	 








//
@GetMapping("/billing ")
public String addBillingDetails(Model model)
{
 
	
	List<Customer> listCustomer   =customerrepo.findAll();
	
	model.addAttribute("listcust",listCustomer);

	model.addAttribute("listcustomer",new Customer());
	


	return "billing_form";
}









@RequestMapping(value="/",method=RequestMethod.GET)
public String GetAllCapitalAccount(Model model)
 {

	model.addAttribute("searchById",service.getAllCapitalAccount());
	return "index1";
	
}

@GetMapping("/showNewCapitalAccountForm")
public String ShowNewMasterForm(Model model)
{

CapitalAccountClass ca = new CapitalAccountClass();

model.addAttribute("addcapitalaccount",ca);

return "new_form";

}




@GetMapping("/updateCapitalForm")
public String showUpdateForm(Model model)
{

CapitalAccountClass ca = new CapitalAccountClass();

model.addAttribute("update",ca);

return "update.html";

}




@GetMapping("/deleteCapitalForm")
public String deleteCapitalForm(Model model)
{

CapitalAccountClass ca = new CapitalAccountClass();

model.addAttribute("delete",ca);



return "delete.html";


}



@GetMapping("/updatesById")
public String updatesById(Model model,int id )

{
    
        if(id !=0)
        {
        model.addAttribute("updateid",service.findById(id));
	   
        }
        	
       
   
		return "update_form.html";
	
}



@GetMapping("/deleteById")
public String deleteById(Model model,int id )

{
    
        if(id !=0)
        {
        	 service.deleteTrialBalanceBytId(id);
	   
        }
        	
       
		return "redirect:/";
   
		
	
}





@PostMapping("/SaveMasterData")
public String SaveCapitalAccount(@ModelAttribute("account") CapitalAccountClass ca)	
{
	service.SaveCapitalAccount(ca);
	System.out.println(ca.getParticulars());
	System.out.println(ca.getDebit());
	System.out.println(ca.getCredit());
	return "redirect:/";
}


@GetMapping("/showFormForUpdate/{id}")
public String UpdateCapitalAccount(@PathVariable (value ="id" ) int id ,Model model )	
{
	
	CapitalAccountClass ca=service.geAccountTypeById(id);
	
	model.addAttribute("updateid",ca);
	
	System.out.println("id: "+ca.getId());
	System.out.println("Debit: "+ca.getDebit());
	System.out.println("credit: "+ca.getCredit());
	
	return "update_form";
}

@GetMapping("/deleteTrialBalance/{id}")
public String deleteTrialBalance(@PathVariable (value="id") int id)
{
		this.service.deleteTrialBalanceBytId(id);
		return "redirect:/";
	
}	


@GetMapping("/searchById")
public String searchById(Model model,int id )

{
    
        if(id !=0)
        {
        model.addAttribute("searchById",service.findById(id));
	   
        }
        	
       
        System.out.println("id =" +id);
		return "update.html";
	
}	


@GetMapping("/searchByParticular")
public String searchByParticular(Model model,String particulars )

{
    
        if(particulars !=null)
        {
        model.addAttribute("searchById",service.findByParticularsSorted(particulars));
	    }
        	
       
        
		return "index1.html";
	
}	

@GetMapping("/searchByDebit")
public String searchByDebit(Model model,double debit )

{
    
        if(debit != 0)
        {
        model.addAttribute("searchById",service.findByDebit(debit));
	    }
        	
       
        
		return "index1.html";
	
}	

@GetMapping("/searchByCredit")
public String searchByCredit(Model model,double credit )

{
    
        if(credit != 0)
        {
        model.addAttribute("searchById",service.findByCredit(credit));
	    }
        	
       
        
		return "index1.html";
	
}	

@GetMapping("/searchByCreditGreater")
public String searchByCreditGreater(Model model,double credit )

{
    
        if(credit != 0)
        {
        model.addAttribute("searchById",service.findByCreditGreaterThan(credit));
	    }
        	
       
        
		return "index1.html";
	
}


	
}