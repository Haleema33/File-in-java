package lab05;

// packages imported
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

class Task02 {
	
	public static void main(String[] args){
		
	  // creating a file
		String s = " Vehicle name , Fuel Capacity, Fuel cost, \n Fuel Economy \n\n";
	    byte data[] = s.getBytes();
	    Path p = Paths.get("./task02.txt");
	    
	    try (OutputStream out = new BufferedOutputStream(Files.newOutputStream(p,CREATE, APPEND))){
	    	out.write(data,0,data.length);
	    }
	    	
       catch (IOException x)
	    {
    	   System.err.println(x);
	    }		    

		
		//declaring variables
		String Vehicle;
		double Economy,cost;
		long Capacity;

		//getting values from the user
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the Vehicle name :  ");
		Vehicle = scan.nextLine();
		
		System.out.println("Fuel Capacity : ");
		Capacity = scan.nextLong();
		
		System.out.println("Enter the fuel cost : ");
		cost = scan.nextDouble();
		
		System.out.println("Enter the Fuel Economy : ");
		Economy = scan.nextDouble();
		
		System.out.printf("Vehicle "+ Vehicle+ " holds "+ Capacity+ " liters of fuel at a cost of " +cost+  " per liter."  );
		System.out.println(" On average it returns "+ Economy+" mpg.");
		scan.close();
		
		//changing values in file
	      try(FileWriter fw = new FileWriter("task02.txt", true);
		        BufferedWriter bw = new BufferedWriter(fw);
		        PrintWriter out = new PrintWriter(bw))
		        {
		            out.println(Vehicle +"  "+ Capacity +"  "+ cost+"  \n" + Economy+" \n\n" );
		        } catch (IOException e) {
		        	 System.err.println(e);
		        }
	    
	}
}