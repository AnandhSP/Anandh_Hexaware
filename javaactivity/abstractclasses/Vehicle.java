package com.hexaware.abstractclasses;

public abstract class Vehicle {
	private String name;
	private double rentalprice;
	private boolean isrented;
	
	public Vehicle(String name, double rentalprice) {
		this.name= name;
		this.rentalprice = rentalprice;
		this.isrented = false;
		}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public double getrentalprice() {
		return rentalprice;
	}
	public boolean isrented() {
		return isrented;
	}
	public void setrented(boolean isrented) {
		this.isrented = isrented;
	}
	
	public abstract void rentVehicle();
	public abstract void returnVehicle();
}
