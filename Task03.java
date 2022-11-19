package lab05;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task03 {

	//declaring variables
	 public  static double FuelEconomy = 4.54609,cost;
	 public static long Capacity;
	 public static double price;
	public static double range;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Fuel Capacity : ");
		Capacity = scan.nextLong();
		
		System.out.println("Enter the fuel cost : ");
		cost = scan.nextDouble();
		
			
		//methods called
		calculatingPrice();
		calculatingRange();
		
		//printing the output
		System.out.printf("It will cost £ %.2f to fuel the vehicle at the specified rates."+"\r\n"
				+ "On average, this will give the vehicle a range of %.1f miles.",price,range);
	


	}

	//Calculating the price
	public static double calculatingPrice() {
	    price = FuelEconomy * cost;
	   return price;
	}
	
	//Calculating the range
	   public static double calculatingRange() {
	    	 range = Capacity *FuelEconomy;
	    	return range;
	    }
		
	
}
