package com.katalyst;

public class Cookie extends DessertItem{
	private int prizePerDozen;
	private int quantityOrdered;

	public Cookie() {
		// TODO Auto-generated constructor stub
	}
	
	public Cookie(String itemName,int prizePerDozen, int quantityOrdered) {
		super(itemName,quantityOrdered,prizePerDozen);
		this.prizePerDozen = prizePerDozen;
		this.quantityOrdered = quantityOrdered;
	}
	
	//returns cost of order
	int costOfItem() {
		return ((prizePerDozen*quantityOrdered)/12); //1 dozen = 12 items
	}

	@Override
	public String toString() {
		return "Cookie : Prize Per Dozen=" + prizePerDozen + ", Quantity Ordered=" + quantityOrdered ;
	}
	
	
}
