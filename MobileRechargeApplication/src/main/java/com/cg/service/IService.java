package com.cg.service;

import com.cg.model.Account;

public interface IService {
 public Account saveAccount(Account acc);
 public double getBalance(String mobileNo);
 public Account updateBalance(double bal,String mobileNo);
}
