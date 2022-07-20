package com.lq.bank.model;

public class Customer 
{
	private String name;
	private String family;
	private String age;
	private Branch branch;	
	
	
	
	
	public Customer(String name, String family, String age, Branch branch) {
		super();
		this.name = name;
		this.family = family;
		this.age = age;
		this.branch = branch;
	}


	public String getFamily() {
		return family;
	}


	public void setFamily(String family) {
		this.family = family;
	}


	public Branch getBranch() {
		return branch;
	}


	public void setBranch(Branch branch) {
		this.branch = branch;
	}


	public String getFirstName() 
	{
		return name;
	}
	
	public void setFirstName(String name) 
	{
		this.name = name;
	}
	
	public String getLastName() 
	{
		return family;
	}
	
	public void setLastName(String family) 
	{
		this.family = family;
	}
	
	public String getAge() 
	{
		return age;
	}
	
	public void setAge(String age)
	{
		this.age = age;
	}
	
	
	
	
	
	
	
	
	
}
