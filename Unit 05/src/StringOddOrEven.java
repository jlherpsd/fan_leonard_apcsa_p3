//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
		
	}

	public StringOddOrEven(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
		
	}

 	public boolean isEven()
 	{
 		int i = word.length();
 		if ( i%2 == 0) {
 			return true;
 		}
 		else {
 			return false;
 		}
		
	}

 	public String toString()
 	{
 		if (isEven() == true) {
 			String output= word + " is even";
 			return output;
 		}
 		else {
 			String output= word + " is odd";
 			return output;
 		}
	}
}