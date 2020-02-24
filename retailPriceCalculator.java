
/**
 * Program: Retail Price Calculator
 * @author Hansen Li
 * Date: April 10, 2017
 * Description: Takes the wholesale price and a percentage as two inputs and returns new price
 */

import java.util.*;
import java.text.*;
public class calculator {

	// method returning the new cost using the input value and percent
	public static double calculateRetail(double num1, double num2){
		
		//decimal format to two places for money format
		DecimalFormat df = new DecimalFormat("#.00");
		
		//setting new cost using previous values
		double cost = num1 + (num1 * (num2/100));
		System.out.println("The new cost of your item is $" + df.format(cost));
		
		//returns value for method
		return cost;
		
	}
	
	// main method
	public static void main(String[] args){
		
		//initializes two doubles for two inputs
		double x,y;
		System.out.println("Hello there!");
		
		//creates a do while loop to check for positive cash value
		do{
		System.out.println("Please input the wholesale cost of an item:");
		
		//creates scanner for input and converts to double and stored in variable
		Scanner price = new Scanner(System.in);
		x = price.nextDouble();
		
		//prints error message if invalid input
		if (x<0){
			System.out.println("Error: Value cannot be negative.");
		}
		}while(x < 0);
		
		System.out.println("Now please input the markup (or markdown) percentage:");
		
		//creates scanner for input and converts to double and stored in variable
		Scanner percent = new Scanner(System.in);
		y = percent.nextDouble();
		
		//calls method to calculate with input values and return with it
		calculateRetail(x,y);
	
}
}

