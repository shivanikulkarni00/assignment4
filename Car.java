package Assignment30;
/*
 * 
5.    Write a program that has variables to store Car data like; CarModel, CarName,  
CarPrice and CarOwner. The program should include 
functions to assign user defined values to the above mentioned variable and a
display function to show the values.
 Write a main that calls these functions.
  Now write another runner class that declares
   three Car objects and displays the data of
    all three.
 */
import java.util.*;
public class Car {

	private String carModel;
	private String carName;
	private double carPrice;
	private String carOwner;
	public Car() {
		// TODO Auto-generated constructor stub
	}
	   public void assignValues() {

	       Scanner scanner = new Scanner(System.in);

	       System.out.print("Enter Car Model: ");

	       carModel = scanner.nextLine();

	       System.out.print("Enter Car Name: ");

	       carName = scanner.nextLine();

	       System.out.print("Enter Car Price: ");

	       carPrice = scanner.nextDouble();

	       scanner.nextLine();

	       System.out.print("Enter Car Owner: ");

	       carOwner = scanner.nextLine();

	   }

	   public void displayValues() {

	       System.out.println("Car Model: " + carModel);

	       System.out.println("Car Name: " + carName);

	       System.out.println("Car Price: " + carPrice);

	       System.out.println("Car Owner: " + carOwner);

	       System.out.println();

	   }

	}



	

