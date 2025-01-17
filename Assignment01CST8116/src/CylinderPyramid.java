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

/* This class models a cylinder pyramid and calculates its volume.*/
public class CylinderPyramid {
	//field declarations
	private double radius; //radius of single cylinder
	private double height; //height of single cylinder
	private double decrease = 0.8; //used to decrease radius by 20% 
		
	//no-arg constructor CylinderPyramid
	public CylinderPyramid() {
		radius = 0.0;
		height = 0.0;
	}
	//getter for radius
	public double getRadius() {
		return radius;
	}
	//setter for radius
	public void setRadius(double radius) {
		this.radius = radius;
	}
	//getter for height
	public double getHeight() {
		return height;
	}
	//setter for height
	public void setHeight(double height) {
		this.height = height;
	}
	//worker method
	//calculate the volume of the 3 tiered cylinder pyramid
	/*volume of Cylinder reference: [1] Mathful.com, "Volume of a Cylinder Calculations:
	 * Formulas, Types, and Applications," Mathful.com, [Online]. Available:
	 * https://mathful.com/hub/volume-of-cylinder. [Accessed 27 September 2024].*/
	public double calculateVolume() {
		double bottomCylinder = Math.PI*(Math.pow(radius,2))*height;
		double middleCylinder = Math.PI*(Math.pow((radius*decrease),2))*height;
		double topCylinder = Math.PI*(Math.pow((radius*decrease*decrease),2))*height;
		return bottomCylinder + middleCylinder + topCylinder;
	}
}
