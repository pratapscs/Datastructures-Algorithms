package com.datastructures.demo;

import java.util.Vector;
//import java.util.Enumeration;

/* data structures provided by the Java utility package are very powerful 
 * and perform a wide range of functions
 * 
Enumeration - interface - defines the methods by which you can enumerate (obtain one at a time)
 			  the elements in a collection of objects.
 			  
            - This legacy interface has been superceded by Iterator.
            
 */
public class Enumeration 
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String args[])
	{
	      java.util.Enumeration days;
	      Vector dayNames = new Vector();
	      dayNames.add("Sunday");
	      dayNames.add("Monday");
	      dayNames.add("Tuesday");
	      dayNames.add("Wednesday");
	      dayNames.add("Thursday");
	      dayNames.add("Friday");
	      dayNames.add("Saturday");
	      days = dayNames.elements();
	      while (days.hasMoreElements())
	      {
	         System.out.println(days.nextElement()); 
	      }
	}
}
