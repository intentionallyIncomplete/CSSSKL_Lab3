/*
 * Instructions unclear about what to name this class and how to write it.
 */
public class Point2D
{
	//Setting the x and y coordinate to 0, because they shouldn't be null ever.
	private int x;
	private int y;

	public static void main(String[] args) { 

		Point2D a = new Point2D();   
		a.setX(5);   
		a.setY(2);   
		System.out.println("Point at (" + a.getX() + ", " + a.getY() + ")");   
		a.translate(-1,-1);   
		System.out.println("Point at (" + a.getX() + ", " + a.getY() + ")");   
		//a.resetToOrigin();   
		//System.out.println("Point at (" + a.getX() + ", " + a.getY() + ")"); 
		System.out.println(a.toString());
		//Point2D b = new Point2D();   
		//Point2D c = new Point2D();   
		//System.out.println(b.toString());   
		//System.out.println(c);  
		//Question: why don't I need c.toString() here?   
		//System.out.println("Are b and c equal? :" + b.equals(c));  
	}

	//default constructor
	public Point2D() {
		this.x = 0;
		this.y = 0;
	}

	//overload constructor
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//copy constructor
	public Point2D(Point2D that) {
		this.x = that.x;
		this.y = that.y;
	}

	//I have no idea if this is correct. The instructions aren't clear
	//What is a "start point?". 
	public String getStartPoint(){
		return this.x + "," + this.y;
	}
	
	public void setStartPoint(Point2D start){
		this.x = start.x;
		this.y = start.y;
	}
	
	//This method should set your private variable x equal to nX. 
	public void setX(int nX) { 
		this.x = nX;
	}

	//Similar to above but for y 
	public void setY(int nY) { 
		this.y = nY;
	}

	//This function should return a copy of your private integer x; 
	public int getX() { 
		return this.x;
	}

	//Similar to above, but for y. 
	public int getY() { 
		return this.y;
	}

	//This function sets both x and y to zero. 
	public void resetToOrigin() {
		x = 0;
		y = 0;
	} 

	//This method adds dx to x, and dy to y 
	public void translate(int dx, int dy) {
		x += dx;
		y += dy;
	} 
	
	//Calculating the distance by taking in a new point on the line
	//then applying the distance formula to find the difference in the points
	public double calculateDistance(Point2D endPoint){
		return Math.sqrt(((this.x - endPoint.getX())^2) + ((this.y - endPoint.getY())^2));
	}

	@Override 
	//returns a string representation of the point 
	public String toString() { 
		return "Line start(" + this.getStartPoint() + ") and line end(" + this.getStartPoint();
	}


	//returns true if this is equal to that; don't just use this == that } 
	public boolean equals(Object that) {
		if((Point2D)that == null || (Point2D)that != this){
			return false;
		}else if(((Point2D) that).getStartPoint() == this.getStartPoint()){
			return true;
		}else{
			return false;
		}
	}
}


