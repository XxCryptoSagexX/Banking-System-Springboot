package com.lq.bank.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lq.bank.service.AccountService;




@RestController
@RequestMapping("/api/accounts")
public class AccountController 
{
	/*
	 * Checking=>1 Savings=>2 Salary=>3 Credit=>4
	 * 
	 */
	@Autowired
	private AccountService accountService;
		
	@GetMapping
		public List<Map> listOfAllAccounts()
		{
			return accountService.getAllAccounts();
		}
	@GetMapping
	public List<Map> getAccountInfo()
	{
		return accountService.getAccountInfo();
	}
		
		
		@PutMapping("/{id}")
		public String updateAccount()
		{
			return "Soon-UpdateAccount";
		}
		
		@DeleteMapping("/{id}")
		public String deleteAccount()
		{
			return "Soon-DeleteAccount";
		}
		
		@PostMapping("/{id}/deposit")
		public String depositAccount()
		{
			return "Soon-CreateAccount-d";
		}
		
		@PostMapping("/{id}/withdrawal")
		public String withdrawlAccount()
		{
			return "Soon-CreateAccount-wd";
		}
		
		
		
		
	
}
