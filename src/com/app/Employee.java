package com.app;

public class Employee {
	private int id;
	private String name;
	private double sal;
	
	

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(10);
		e.setName("raju");
		e.setSal(80.0);
	}

}
