package com.lq.bank.model;

public class Branch
{
	private int branchID;
	private String branchName;
	
	
	
	
	public Branch(int iD, String name) 
	{
		super();
		branchID = iD;
		branchName = name;
	}
	
	public int getBranchID() 
	{
		return branchID;
	}
	
	public void setBranchID(int iD)
	{
		branchID = iD;
	}
	
	public String getName() 
	{
		return branchName;
	}
	
	public void setName(String name)
	{
		branchName = name;
	}
	
	
	
}
