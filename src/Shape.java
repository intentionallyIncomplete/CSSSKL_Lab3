import java.awt.Color;
import java.awt.Graphics;

/**
 * Class Description:
 * @author Ian Bryan
 * @version 10/15/2018
 * 
 * 
 * The Shape class serves as a template for future shapes that will
 * be drawn onto the canvas. There are several invariants listed
 * in the "Date Members" section.
 * */
public class Shape {
	/*
	 * Class Invariants
	 * 
	 * 1) Distance to travel must not be negative
	 * 2) Calculate of area must return a double if given a double
	 * 3) X-Y coordinates cannot be equal
	 * 4) Color values are valid and do not go below 0 or above 255
	 * */

	Color color = new Color(00000);
	private int x_coord,y_coord;

	public Shape(){
		System.out.println("No data provided");
	}

	public Shape(int x, int y, Color newColor){
		x_coord = x;
		y_coord = y;
		color = newColor;
	}
	public Shape(Shape other){
		x_coord = other.x_coord;
		y_coord = other.y_coord;
	}

	public int getX(){	return this.x_coord;	}

	public int getY(){	return this.y_coord;	}

	public String toString(){
		return " Shape(" + x_coord + "," + y_coord + ") " + " - Color: " + color + " - and area: " + getArea();
	}
	
	public double getArea(){	return -1;	}
	
	public void draw(Graphics g){/*empty for now*/}

	//Delcared a main to run some tests. Created 3 Shape
	//objects and called toString() on them.
	public static void main(String[] args){
		Shape shapeA = new Shape(120, 0,null);
		Shape shapeB = new Shape(10, 140,Color.red);
		Shape shapeC = new Shape(10, 10,Color.cyan);

		System.out.println("a: " + shapeA.toString());
		System.out.println("b: " + shapeB.toString());
		System.out.println("c: " + shapeC.toString());
	}
}
