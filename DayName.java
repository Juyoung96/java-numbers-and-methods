/*
 * Project: DayName.java
 * Description: Prints the name of the day of the week of an input
 * Name: Aron Snowberher
 * Date: Sept 23, 2015
 */

import java.util.Scanner;

public class DayName{
 
  public static void main( String[] args) {
    
    Scanner s = new Scanner( System.in );
    int day;
    
    System.out.println( "Enter a number to find the day of the week: ");
    day = s.nextInt();
    
    System.out.println( "Today is day #" + day + ": " + getName( day ) );
    
  } //end main method
  
  public static String getName( int day ) {
    
    switch( day ) {
     
      case 1: 
        return "Monday";
      case 2:
        return "Tuesday";
      case 3:
        return "Wednesday";
      case 4:
        return "Thursday";
      case 5:
        return "Friday";
      case 6:
        return "Saturday";
      case 7:
        return "Sunday";
      default:
        return "Error - not a day number";
      
    }
    
  } //end getName method
  
} // end class