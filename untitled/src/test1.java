// A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//Ask user for quantity.
//Suppose, one unit will cost 100. print total cost for user

package test2;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantity the product units: ");
		int quantity = sc.nextInt();
		
		int unitprice = 100;
		int totalcost = quantity * unitprice;
		
		if(totalcost > 1000) {
			double discount = 0.10 * totalcost;
			totalcost -= discount;
			System.out.println("Discount : ");
			
		}
		
		System.out.println("Total Cost: " + totalcost);
		

	}

}






