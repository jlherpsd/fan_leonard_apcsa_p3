//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		int l = str.length();
		for (int x = 1; x<=l-1; x++) {
			if (str.substring(x-1,x).equals(str.substring(x,x+1))) {
				count++;
			}
			else {
			}
		}
		return count;
	}
}