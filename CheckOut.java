package com.katalyst;

import java.util.ArrayList;

public class CheckOut {

//	public CheckOut() {
//		// TODO Auto-generated constructor stub
//	}
//	private int totalOrderCost;
	
	//create array cashregister of type dessertItems
	
	//ArrayList<DessertItem> a= new ArrayList<DessertItem>();
	DessertItem d;
	String itemName;
	
	public CheckOut(Integer itemType,int quantityOrdered,int price,ArrayList<DessertItem> a) {
		if(itemType==1) {
			itemName="Candy";
			d=new Candy(itemName,price,quantityOrdered);
			a.add(d);			
		}else if(itemType==2) {
			itemName="Cookie";
			d=new Cookie(itemName,price,quantityOrdered);
			a.add(d);
		}else if(itemType==3) {
			itemName="IceCream";
			d=new IceCream(itemName,price,quantityOrdered);
			a.add(d);
		}else if(itemType==4) {
			itemName="Sundae";
			d=new Sundae(itemName,price,quantityOrdered);
			a.add(d);
		}
		
	}
	

	public void generatingBill(ArrayList<DessertItem> a) {
		System.out.println("|----------------------------------------------------------------------|");
		System.out.println("| Item        "+"Quantity Ordered       "+"Price Per Unit             "+"Price  |");//12,19,11
		System.out.println("|----------------------------------------------------------------------|");
		for(int i=0;i<a.size();i++) {
			System.out.println("| "+a.get(i).nameOfItem()+"       "+a.get(i).getQuantityOrdered()+"                       "+a.get(i).getPrice()+"                         "+a.get(i).costOfItem()+"  |");
		}
		System.out.println("|----------------------------------------------------------------------|");

	}
	
	//calculates total bill
	int total=0;
	int cost(ArrayList<DessertItem> a) {
		for(int i=0;i<a.size();i++) {
			total += a.get(i).costOfItem();
		}
		return total;
	}
	
}
