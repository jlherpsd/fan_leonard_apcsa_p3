//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
	}

	public LetterRemover(String s, char rem) {
		setRemover(s, rem);
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String newSentence = "";
		int l = sentence.length();
		for (int i=0; i<l; i++) {
			if (sentence.charAt(i) == lookFor) {
				
			}
			else {
				newSentence = newSentence + sentence.charAt(i);
			}
		}
		String cleaned=newSentence;
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
	}
}