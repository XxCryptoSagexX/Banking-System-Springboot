package com.lq.bank.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class AccountService 
{
	public List<Map<String,Object>> listOfAllAccounts()
	{
		List<Map<String,Object>> accountsList = new ArrayList<Map<String,Object>>();
		
		Map<String,Object> accountInfo = new HashMap<String,Object>();
		
			accountInfo.put("AccountID",10);
			accountInfo.put("Type",1);
			accountInfo.put("Balance", 1500.98);
			accountInfo.put("Customer ID", 1);
			accountInfo.put("Label", "Checking 1");
			accountInfo.put("BranchID", 850);

		accountsList.add(accountInfo);
		
		
		Map<String,Object> accountInfo_2 = new HashMap<String,Object>();
		
			accountInfo_2.put("AccountID",16);
			accountInfo_2.put("Type",2);
			accountInfo_2.put("Balance", 68000.51);
			accountInfo_2.put("Customer ID", 2);
			accountInfo_2.put("Label", "Saving 1");
			accountInfo_2.put("BranchID", 150);
		
		accountsList.add(accountInfo_2);

		return accountsList;
	}
	
	public List<Map> getAccountInfo()
	{
		List<Map> accountList = new ArrayList<Map>();

		Map<String, Object> accountInfo = new HashMap<String, Object>();

		accountInfo.put("accountId", 10);
		accountInfo.put("type", 1);
		accountInfo.put("balance", 1500.98);
		accountInfo.put("customerId", 1);
		accountInfo.put("label", "Checking 1");
		accountInfo.put("branchId", 850);

		accountList.add(accountInfo);

		return accountList;
	}
}
