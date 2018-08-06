package com.cg.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.model.Account;
@Repository
public interface IRepo extends JpaRepository<Account, String> {
	@Query("SELECT a FROM Account a where a.mobileNo = :id") 
	Account getAccount(@Param("id") String id);
	
	@Query("SELECT a.balance FROM Account a where a.mobileNo = :id") 
    double getBalance(@Param("id") String id);
	
	@Query("UPDATE Account a SET a.balance=:balance where a.mobileNo=:id") 
    Account updateBalance(@Param("balance")double bal,@Param("id")String id); 
	
}