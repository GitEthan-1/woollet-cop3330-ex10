package ex10.base;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Exercise 10 - Self-Checkout
 * Working with multiple inputs and currency can introduce some tricky precision issues.
 *
 * Create a simple self-checkout system. Prompt for the prices and quantities of three items. Calculate the subtotal of the items.
 * Then calculate the tax using a tax rate of 5.5%. Print out the line items with the quantity and total, and then print out the subtotal, tax amount, and total.
 *
 * Example Output
 *
 * Enter the price of item 1: 25
 * Enter the quantity of item 1: 2
 * Enter the price of item 2: 10
 * Enter the quantity of item 2: 1
 * Enter the price of item 3: 4
 * Enter the quantity of item 3: 1
 * Subtotal: $64.00
 * Tax: $3.52
 * Total: $67.52
 *
 * Constraints
 *
 * Keep the input, processing, and output parts of your program separate. Collect the input, then do the math operations and string building, and then print out the output.
 * Be sure you explicitly convert input to numerical data before doing any calculations.
 *
 * Challenges
 *
 * Revise the program to ensure that prices and quantities are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
 * Alter the program so that an indeterminate number of items can be entered. The tax and total are computed when there are no more items to be entered.
 */

public class App {
	public static void main(String[] args) {
		final double TAX = 0.055;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the price of item 1: ");
		int price1 = Integer.parseInt(in.nextLine());
		
		System.out.print("Enter the quantity of item 1: ");
		int quantity1 = Integer.parseInt(in.nextLine());
		
		System.out.print("Enter the price of item 2: ");
		int price2 = Integer.parseInt(in.nextLine());
		
		System.out.print("Enter the quantity of item 2: ");
		int quantity2 = Integer.parseInt(in.nextLine());
		
		System.out.print("Enter the price of item 3: ");
		int price3 = Integer.parseInt(in.nextLine());
		
		System.out.print("Enter the quantity of item 3: ");
		int quantity3 = Integer.parseInt(in.nextLine());
		
		
		double preTax = price1 * quantity1 + price2 * quantity2 + price3 * quantity3;
		
		double salesTax = preTax * TAX;
		
		double postTax = preTax + salesTax;
		
		NumberFormat usFormat = NumberFormat.getCurrencyInstance();
		
		System.out.println("Subtotal: " + usFormat.format(preTax));
		System.out.println("Tax: " + usFormat.format(salesTax));
		System.out.println("Total: " + usFormat.format(postTax));
	}
}
