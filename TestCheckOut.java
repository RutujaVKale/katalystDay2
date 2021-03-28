package com.katalyst;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCheckOut {

	//private static final String  = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int candyPrice=70;//per kg
		int cookieprice=50;//price per dozen
		int iceCreamPrice=40;//per icecream
		int toppings=iceCreamPrice+25;//toppings price
		
		//Candy c1 = new Candy(1200,50);
		ArrayList<DessertItem> a= new ArrayList<DessertItem>() ;
		
		CheckOut c = null;
		int buyMore=1;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Choose your items:");
			System.out.println("1.candy");
			System.out.println("2.Cookie");
			System.out.println("3.Ice Cream");
			System.out.println("4.Sundae");
			Integer itemType = sc.nextInt();
			
			System.out.println("Enter the quantity you want to buy: 1)Candy in gms 2)Cookie in units 3)IceCream in units 4)Sundae in units");
			int quantityOrdered=sc.nextInt();
						
			if(itemType==1) {
				c = new CheckOut(itemType,quantityOrdered,candyPrice,a); 
			}else if(itemType==2) {
				c = new CheckOut(itemType,quantityOrdered,cookieprice,a); 
			}else if(itemType==3) {
				c = new CheckOut(itemType,quantityOrdered,iceCreamPrice,a); 
			}else if(itemType==4) {
				c = new CheckOut(itemType,quantityOrdered,toppings,a); 
			}
			
			System.out.println("You want to buy more? press 1");
			buyMore=sc.nextInt();
			System.out.println();
		}while(buyMore==1);
		System.out.println();
		c.generatingBill(a);
		
		System.out.println("Total :"+c.cost(a));
		//Candy c1 = new Candy(1200,50);
		//System.out.println("prize of candy is "+c1.getPrizePerKg());
	}

}
