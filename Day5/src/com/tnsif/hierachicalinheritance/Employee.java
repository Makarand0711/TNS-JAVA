package com.tnsif.hierachicalinheritance;


public class Employee extends Person {

	private String empId;
	private float salary;
	private String dept;
	
	
	public Employee() {
		System.out.println("default Value of Employee class ");
		empId = "1234";
		salary = 550000;
		dept = "IT";
	}


	public Employee(String name, String city, String empId, float salary, String dept) {
		super(name , city);
		this.empId = empId;
		this.salary = salary;
		this.dept = dept;
	}


	public String getEmpId() {
		return empId;
	}


	public void setEmpId(String empId) {
		this.empId = empId;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", dept=" + dept + ", getName()=" + getName()
				+ ", getCity()=" + getCity() + "]";
	}
	
	
}