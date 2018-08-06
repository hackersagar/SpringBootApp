package com.cg.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.Account;
import com.cg.service.IService;

@RestController
@Transactional
public class AccountController {
	@Autowired
	private IService service;
	@RequestMapping(value="/addData",method=RequestMethod.POST)
	public Account saveAccount(@RequestBody Account acc) {
		service.saveAccount(acc);
		return acc;
		
	}
	@RequestMapping(value="/getBal",method=RequestMethod.GET)
	public double getBalance(String mobileNo) {
		
		return service.getBalance(mobileNo);
		
	}
	
	@RequestMapping(value="/updateBal",method=RequestMethod.POST)
	public double updateBalance(String mobileNo, double bal) {
		Account acc=service.updateBalance(bal, mobileNo);
		return acc.getBalance();
		
	}
	
	
	
	

}
