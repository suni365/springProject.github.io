package com.captal.account.Dao;

import com.captal.account.Model.*;
import com.captal.account.dto.OrderRequest;


import java.util.List;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo  extends JpaRepository<Customer,Integer> {
	
	//@Query("select new com.captal.account.dto.OrderRequest(c.cname,c.clintId,cPhone,p.pid,p.credit,p.debit,p.particular) from Customer c join Product p")
	//public List<OrderRequest> getJoinInformation();

}

