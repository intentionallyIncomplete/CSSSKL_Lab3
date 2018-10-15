/**
 * Class Description:
 * @author Ian Bryan
 * @version 10/15/2018
 * 
 * The purpose of this class is to design a replica of the String class
 * which means this class is immutable.
 * */
public class CharList {

	/*Data Members*/
	private char[] expandedString = new char[100];
	private int charCount;

	//no-arg c'tor
	public CharList(){/*empty for now*/}

	//The common use constructor.
	//Takes in String argument for teardown
	public CharList(String untouchedString){
		expandedString = untouchedString.toCharArray();
	}

	//This is a generic copy constructor with a little
	//error handling inside. This if-else statement coordinates
	//with the class invariant to not allow the list to be null (must have value(s))
	public CharList(CharList other){
		if(other == null){
			System.out.print("error, CharList cannot be null");
		}else{
			expandedString = other.expandedString;
			charCount = other.charCount;	
		}
	}

	//Basic method for expanding and adding a new character when
	//needed. 
	public void add(char next){
		expandedString[charCount++] = next;
	}

	//Getter for the length of the array (String)
	public int getStringSize(){
		return charCount;
	}

	//Getting a certain character at the specified index.
	public char get(int index){
		char charAtIndex = ' ';
		for(int i=0;i<=index;i++){
			charAtIndex = expandedString[index];
		}
		return charAtIndex;
	}

	//Getting the array contents
	public char[] getChars(){
		return expandedString;
	}

	//Generic toString override method. Will print the array of characters
	@Override
	public String toString(){
		String retVal = "";

		for(int i=0;i<expandedString.length;i++){
			retVal += expandedString[i];
		}
		return retVal;
	}

	//Equals method to check if two "Strings" are the same
	//by checking if the char[] have the same number of indices
	//and the same characters	
	public boolean equals(Object other){
		if(other != null && this.getStringSize() == ((CharList)other).getStringSize()
				&& this.getChars() == ((CharList)other).getChars()){
			return true;
		}else{
			return false;
		}
	}
}
