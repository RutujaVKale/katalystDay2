package com.katalyst;

public abstract class DessertItem {
	private String dessertItemName="";
	private Integer quantityOrdered;
	private Integer price;
	
	//default constructor
	DessertItem(){
		
	}
	
	//parameterized constructor
	public DessertItem(String dessertItemName, Integer quantityOrdered, Integer price) {
		super();
		this.dessertItemName = dessertItemName;
		this.quantityOrdered = quantityOrdered;
		this.price = price;
	}

	

	public String getDessertItemName() {
		return dessertItemName;
	}

	public void setDessertItemName(String dessertItemName) {
		this.dessertItemName = dessertItemName;
	}

	public Integer getQuantityOrdered() {
		return quantityOrdered;
	}

	public void setQuantityOrdered(Integer quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	//abstract method for calculating the cost of the ordered item 
	abstract int costOfItem(); 
	
	//final method to return the ordered item name
	final String nameOfItem() {
		return dessertItemName;
	}
	
	
}
