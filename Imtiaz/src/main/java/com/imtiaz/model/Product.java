package com.imtiaz.model;


public class Product {

	private int no;
	private String brand;
	private int price;
	
	
	public  Product() {
		
	}
	
	
	public Product(int no, String brand, int price) {
		super();
		this.no = no;
		this.brand = brand;
		this.price = price;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
