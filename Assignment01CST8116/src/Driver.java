/*
 * Student Name: Kaitlyn Curtis
 * Lab Professor: Dr. James Mwangi
 * Program: CET-CS
 * Section:333
 * Assessment: Assignment 1
 * Due Date: October 6, 2024
 * Modified: October 2, 2024
 * Description: A program that can creates 3 tiered cylinder pyramids with 
 * radius and height. Then calculates the volume using the assumption that each 
 * cylinder's radius is smaller than the cylinder below it by 20%.
 */

//imports the Scanner class from the util package
import java.util.Scanner;

/* This class outputs the volume of a cylinder pyramid using the main method.*/
public class Driver {
	public static void main(String[] args) {
		//scans input from users keyboard
		Scanner input = new Scanner(System.in);
		
		//instantiate the cylinderPyramid class
		CylinderPyramid cylinderPyramid = new CylinderPyramid();
		
		//set user input for radius
		System.out.printf("Hey beautiful, we'll be calculating the base of a "
				+ "cylinder today using centimeters. %nPlease enter the base "
				+ "cylinder radius: ");
		cylinderPyramid.setRadius(input.nextDouble());
		
		//set user input for height
		System.out.print("Great choice! Now please enter the base cylinder "
				+ "height: ");
		cylinderPyramid.setHeight(input.nextDouble());
		
		//call worker method
		double volume = cylinderPyramid.calculateVolume();
		
		//Outputs result
		System.out.printf("Thank you for your help! The volume of this pyramid "
				+ "is: %.3fcm^3 %n", volume);
			
        //Close the scanner
        input.close();
        
        //Outputs my name
        System.out.printf("%nProgram by: Kaitlyn Curtis");
	}
}

