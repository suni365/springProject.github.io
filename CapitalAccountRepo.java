package com.captal.account.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.captal.account.Model.CapitalAccountClass;

@Repository
public interface CapitalAccountRepo extends JpaRepository<CapitalAccountClass,Integer>{

    @Query(value="select * from capital_account_class a where a.id=?",nativeQuery=true)
    List<CapitalAccountClass> findById(int id);
	
	

    @Query(value="select * from capital_account_class a where a.particulars=?",nativeQuery=true)
	  List<CapitalAccountClass> findByParticularsSorted(String part);
	
    @Query(value="select * from capital_account_class a where a.debit=?",nativeQuery=true) 
    List<CapitalAccountClass> findByDebit(double debit);
	
    @Query(value="select * from capital_account_class a where a.credit=?",nativeQuery=true)
	 List<CapitalAccountClass> findByCredit(double credit);
    
    @Query(value="select * from capital_account_class a where a.credit >=?",nativeQuery=true)
	 List<CapitalAccountClass> findByCreditGreaterThan(double id); 

	
  }
   




