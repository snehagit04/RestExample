package com.example.model;

public class Employee {
	
	
	
	private int empID;
	private String name;
	private String designation;
	private double salay;
	public int getEmpID() {
		return empID;
	}
	public Employee() {
		
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalay() {
		return salay;
	}
	public void setSalay(double salay) {
		this.salay = salay;
	}
	
	
}
