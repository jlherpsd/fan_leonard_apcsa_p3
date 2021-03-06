//(c) A+ Computer Science

//www.apluscompsci.com

//Name - Leonard Fan
//Date - 2/1/19
//Class - APCSA
//Lab  -

import java.util.Scanner; 

import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours;
	private double minutes;
	private double mph;

	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist, hrs, mins);
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance=dist;
		hours=hrs;
		minutes=mins;
		return;
		
	}

	public void calcMPH()
	{
		double minThrs=(minutes/60);
		double hrs = hours + minThrs;
		mph = distance/hrs;
		mph = Math.round(mph);
		return;
		
	}

	public void print()
	{
		minutes = (int) minutes;
		mph = (int) mph;
		System.out.println(distance+" miles in "+hours+" hour and "+minutes+" minutes = "+mph+" MPH.");
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
}