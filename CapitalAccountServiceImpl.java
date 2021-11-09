package com.captal.account.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.JDBCException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import com.captal.account.Model.CapitalAccountClass;
import com.captal.account.Dao.CapitalAccountRepo;

@Service
public class CapitalAccountServiceImpl implements CapitalAccountService   {

	@Autowired 
	CapitalAccountRepo repo;
	

	@Override
	public List<CapitalAccountClass> getAllCapitalAccount() {
		// TODO Auto-generated method stub
		return this.repo.findAll();
	}


	@Override
	public void SaveCapitalAccount(CapitalAccountClass ca) {
		// TODO Auto-generated method stub
		
		
	  this.repo.save(ca);
	  
	}

		@Override
		public CapitalAccountClass geAccountTypeById(Integer id) {
			// TODO Auto-generated method stub
		
	    Optional<CapitalAccountClass>  optional =repo.findById(id);
	    
	    
	    CapitalAccountClass ca  =null;
	    if(optional.isPresent())
	    {
	    	ca=optional.get();
	    }
	    else
	    	
	    {
	    	throw new RuntimeException("Employee not found for id ::" +id);
	    }
	
		  return ca;
		}

				
		@Override
		public void deleteTrialBalanceBytId(int id) {
			// TODO Auto-generated method stub
		  this.repo.deleteById(id);
		}

		

		@Override
		public List<CapitalAccountClass> findById(int id) {
			// TODO Auto-generated method stub
		   return this.repo.findById(id);
		}

		 @Override
		public List<CapitalAccountClass> findByDebit(double debit) {
			// TODO Auto-generated method stub
		 	return this.repo.findByDebit(debit);
		}
		
		
		 @Override
		public List<CapitalAccountClass> findByCredit(double credit) {
			// TODO Auto-generated method stub
		 return this.repo.findByCredit(credit);
		}

		@Override
		public List<CapitalAccountClass> findByCreditGreaterThan(double credit) {
			 // TODO Auto-generated method stub
		return this.repo.findByCreditGreaterThan(credit);
		}


		@Override
		public List<CapitalAccountClass> findByParticularsSorted(String particulars) {
			// TODO Auto-generated method stub
			return this.repo.findByParticularsSorted(particulars);
		}
}
	
	