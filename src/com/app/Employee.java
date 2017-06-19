package com.app;

public class Employee {
	private int id;
	private double sal;
	
	public Employee() {
		super();
	}

	
	public Employee(int id, double sal) {
		super();
		this.id = id;
		this.sal = sal;
	}


	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(10);
		e.setSal(80.0);
	}

}
