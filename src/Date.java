/**
 * Class Description:
 * @author Ian Bryan
 * @version 10/15/2018
 */
public class Date
{
	public static void main(String[] args){
		Date a = new Date();
		Date b = new Date(2,1,2049);
		Date c = new Date(2,1,2049);
		//d.setDate(10, 21, 2018);
		System.out.println("a is: " + a.toString());
		System.out.println("b is: " + b.toString());
		System.out.println("c is: " + c.toString());
		System.out.println("a is equal to b: " + a.equals(b));
		System.out.println("b is equal to c: " + b.equals(c));
	}

	//Data Members
	//month,day,year are all private to maintain encapsulation
	private int month;
	private int day;
	private int year;

	/*Default, no-arg constructor*/
	public Date(){
		setDate(00,00,0000);
	}
	
	//The main constructor which takes the three integer arguments
	public Date(int m, int d, int y){
		setDate(m,d,y);
		//report();
	}
	
	/*COPY CONSTRUCTOR*/
	public Date(Date other){
		this.month = other.month;
		this.day = other.day;
		this.year = other.year;
	}

	/*Getters for all private variables*/
	public int getMonth(){	return this.month;	}

	public int getDay(){	return this.day;	}

	public int getYear(){	return this.year;	}

	//setter method for the Date which contains a month, day, and year attribute
	public void setDate(int m, int d, int y){
		//Boolean condition created by the 'if' statement
		//will display text for conditions that fail. 
		//(i.e day is more than any month's number of available days)
		if(m <= 0 || m >= 13){
			System.out.println("It looks like the month entered is not valid");
		}else if(d <= 0 || d >= 32){
			System.out.println("It looks like the day entered is not valid");
		}else if(y < 0){
			System.out.println("This program does not do B.C");
		}else{
			this.month = m;
			this.day = d;
			this.year = y;
		}
	}

	//prints out date
	public void report(){
		System.out.println("Date: " + day + "." + month + "." + year);
	}

	//Overriding the default toString method with one for this class
	@Override
	public String toString(){
		return ":" + month + "." + day + "." + year;
	}

	//Equals method checks each attribute of a Date including
	//day, month, and year. If equal, returns true.
	//(Date) is typcast to each reference to the `other` Object
	public boolean equals(Object other){
		if(month == ((Date) other).getMonth()
			&& day == ((Date)other).getDay()
			&& year == ((Date)other).getYear()){
			return true;
		}else{
			return false;
		}
	}

	/*
	 * 1. What is the difference between the public and private access modifiers?
	 * 	[]public allows for outside classes to change anothers' data member value or type
	 * 	whereas private requires certain permissions be checked and if not met, only changes
	 * 	are reflected outside the instance class of that variable.
	 * 
	 * 2. When data is defined as static...
	 * a. Can it be accessed or read?
	 * 	[]Yes
	 * b. Can it be written to?
	 * 	[]Yes
	 * c. If we had declared one static variable and 10 objects declared in RAM, 
	 * how many static variables would also be in memory?
	 * 	[]You would have 1 in RAM
	 * 23. When data is defined as final...
	 * a. Can it be accessed/used or read?
	 * 	[]Yes
	 * b. Can it be written to other than the first initialization?
	 * 	[]No
	 * c. Why would it be ok to declare a final (or static final) variable as public?
	 * 	[]No
	 * d. Later: How does the concept of a final variable relate to Immutable classes?
	 * 	[]Some attributes of a class need to remain constant in order to work with other classes
	 * */
}