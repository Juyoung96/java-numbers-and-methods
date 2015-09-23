/*
 * Project: BiggerOne.java
 * Description: Returns the bigger of 2 user input numbers
 * Name: Juyoung Lee
 * Date: Sept 23, 2015
 */

import java.util.Scanner;

public class BiggerOne {
  
  public static void main( String[] args) {
    
    Scanner s = new Scanner( System.in );
    int num1, num2;
    
    System.out.println( "Enter the first number: " );
    num1 = s.nextInt();
    System.out.println( "Enter the second number: " );
    num2 = s.nextInt();
    
    System.out.println( isBigger( num1, num2 ) + " is the bigger number." );
    
  } // end main method
  
  public static int isBigger( int x, int y ) {
    
    if( x == y ) {
      return x;
    } else {
      if( x > y ) return x;
      else return y;
    }
    
  } // end isBigger method
  
} // end class