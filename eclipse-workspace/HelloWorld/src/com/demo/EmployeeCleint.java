package com.demo;

public class EmployeeCleint {
	public static void main(String args[])
	{
	Employee e=new Employee();
	e.setId(101);
	e.setSalary(5000);

	Employee e1=new Employee(110000,40);
	System.out.println(e1.getId()+"............"+e1.getSalary());
	
	System.out.println(e.getId()+"............"+e.getSalary());
	}

}

