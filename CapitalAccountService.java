package com.captal.account.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.captal.account.Model.CapitalAccountClass;


@Service
public interface CapitalAccountService {


	List<CapitalAccountClass> getAllCapitalAccount();
	
	void SaveCapitalAccount(CapitalAccountClass ca);
	
	CapitalAccountClass geAccountTypeById(Integer id);

    void deleteTrialBalanceBytId(int id);
    
    List<CapitalAccountClass> findById(int id);
     List<CapitalAccountClass> findByDebit(double debit);
      List<CapitalAccountClass> findByCredit(double credit);
       List<CapitalAccountClass> findByCreditGreaterThan(double credit);
         List<CapitalAccountClass> findByParticularsSorted(String particulars);
}
