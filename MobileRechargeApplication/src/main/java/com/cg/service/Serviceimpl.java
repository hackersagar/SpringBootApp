package com.cg.service;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.model.Account;
import com.cg.repo.IRepo;
@Service
@PersistenceContext
public class Serviceimpl implements IService {
	@Autowired
	 private EntityManager em;
	@Autowired
      private IRepo repo;
	
	@Override
	public Account saveAccount(Account acc) {
		// TODO Auto-generated method stub
		repo.save(acc);
		return acc;
	}

	@Override
	public double getBalance(String mobileNo) {
		
		return repo.getBalance(mobileNo);
	}

	@Override
	
	public Account updateBalance(double bal,String mobileNo) {
		Account acc=repo.getAccount(mobileNo);
		acc.setBalance(acc.getBalance()+bal);
		//double b=repo.getBalance(mobileNo)+bal;
		//acc.setBalance(b);
		em.merge(acc);
		return acc;
	}
}
