package com.lq.bank.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.lq.bank.model.Branch;

@Service
public class BranchService
{
	public List<Map<String, Object>> listOfBranches()
	{
		
		List<Map<String,Object>> branchesList = new ArrayList<Map<String, Object>>();
		Map<String, Object> branchesInfo = new HashMap<String, Object>();

/// Make sure you name the get functions appropriately
		Branch branchA = new Branch(1, "Branch A");
		branchesInfo.put("BranchName", branchA.getName());
		branchesInfo.put("BranchID", branchA.getBranchID());

		Map<String, Object> branchesInfo_2 = new HashMap<String, Object>();
		Branch branchB = new Branch(2, "Branch B");
		branchesInfo_2.put("BranchName", branchB.getName());
		branchesInfo_2.put("BranchID", branchB.getBranchID());

		branchesList.add(branchesInfo);
		branchesList.add(branchesInfo_2);

		return branchesList;
	}
}
