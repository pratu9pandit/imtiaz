package com.imtiaz.model;

public class Pratiksha {

	private int id;
	private String siblings;
	private double value;
	
	
	public Pratiksha()
	{
		
	}
	
	public Pratiksha(int id, String siblings, double value) {
		super();
		this.id = id;
		this.siblings = siblings;
		this.value = value;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSiblings() {
		return siblings;
	}
	public void setSiblings(String siblings) {
		this.siblings = siblings;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}

	

}
