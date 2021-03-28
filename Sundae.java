package com.katalyst;

public class Sundae extends IceCream{
	private int prizeOfToppings;
	private int quantityOrdered;
	public Sundae() {
		// TODO Auto-generated constructor stub
	}

	
	public Sundae(String itemName,int prizeOfToppings, int quantityOrdered) {
		super(itemName,quantityOrdered,prizeOfToppings);
		this.prizeOfToppings = prizeOfToppings;
		this.quantityOrdered = quantityOrdered;
	}
	
	int costOfItem() {
		return ((prizePerIceCream+prizeOfToppings)*quantityOrdered); //1000gms=1kg
	}
	
	@Override
	public String toString() {
		return "Sundae : Prize of IceCream="+ prizePerIceCream+"Prize Of Toppings=" + prizeOfToppings + ", Quantity Ordered=" + quantityOrdered ;
	}
	

}
