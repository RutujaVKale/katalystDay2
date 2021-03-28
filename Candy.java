package com.katalyst;

public class Candy extends DessertItem{
	private int prizePerKg;
	private int quantityOrdered;
	private String name;

	public Candy() {
		// TODO Auto-generated constructor stub
	}
	

	public Candy(String itemName,int prizePerKg, int quantityOrdered) {
	super(itemName,quantityOrdered,prizePerKg);
	this.prizePerKg = prizePerKg;
	this.quantityOrdered = quantityOrdered;
	}
	
	public int getPrizePerKg() {
		return prizePerKg;
	} 

	public void setPrizePerKg(int prizePerKg) {
		this.prizePerKg = prizePerKg;
	}

	public Integer getQuantityOrdered() {
		return quantityOrdered;
	}

	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	//returns cost of order
	int costOfItem() {
		return ((prizePerKg*quantityOrdered)/1000); //1000gms=1kg
	}

	@Override
	public String toString() {
		return "Candy : Prize Per Kg=" + prizePerKg + ", Quantity Ordered=" + quantityOrdered + " gms";
	}
	
	
	
	

}
