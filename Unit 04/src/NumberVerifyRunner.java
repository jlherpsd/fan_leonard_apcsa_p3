//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		//add in input
		int num;
		System.out.println("Enter a whole number ::");
		num = keyboard.nextInt();
		System.out.println(num+" is odd ::"+NumberVerify.isOdd(num));
		System.out.println(num+" is even ::"+NumberVerify.isEven(num));
		
	}
}