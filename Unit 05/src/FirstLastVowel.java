//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   int i = a.length();
	   String vowel = "aeiouAEIOU";
	   int z = vowel.length();
	   for(int b=0; b<=z; b++){
		   if (a.substring(i-1).equals(vowel.substring(b)) ) {
			  String go = "yes";
			  return go;
		   }
		   else {
			   
		   }
		   
	   }
	   String go = "no";
	   return go;
	}
}