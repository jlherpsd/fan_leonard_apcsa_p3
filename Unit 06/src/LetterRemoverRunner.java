//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a the input :: ");
		String s = keyboard.nextLine();
		char c = s.charAt(s.length()-1);
		
		LetterRemover a = new LetterRemover(s,c);
		
		a.removeLetters();
		System.out.println(a.toString());
											
	}
}