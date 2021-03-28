package com.katalyst;

public class IceCream extends DessertItem{
	
	protected int prizePerIceCream;
	protected int quantityOrdered;

	public IceCream() {
		// TODO Auto-generated constructor stub
	}
		
	public IceCream(String itemName,int prizePerIceCream, int quantityOrdered) {
		super(itemName,quantityOrdered,prizePerIceCream);
		this.prizePerIceCream = prizePerIceCream;
		this.quantityOrdered = quantityOrdered;
	}
	
	//returns cost of order
	int costOfItem() {
		return (prizePerIceCream*quantityOrdered); //1000gms=1kg
	}

	
	@Override
	public String toString() {
		return "IceCream : Prize Per IceCream=" + prizePerIceCream + ", Quantity Ordered=" + quantityOrdered ;
	}

	
	

}
