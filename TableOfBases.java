/*
 * Project: TableOfVases.java
 * Description: Prints a table of Decimal, Binary, Octal, Hex, ASCII characters
 * Name: Juyoung Lee
 * Date: Sept 23, 2015
 */

public class TableOfBases {
  
  public static void main( String[] args) {
    
    System.out.println( "TABLE OF BASES" );
    System.out.println( "Decimal\tBinary\tOctal\tHex\tASCII" );
    
    for ( int i = 65; i <= 90; i++ ) {
      System.out.print( i );
      System.out.print ("\t" + Integer.toBinaryString( i ) );
      System.out.print ("\t" + Integer.toOctalString( i ) );
      System.out.print ("\t" + Integer.toHexString( i ) );
      System.out.print ("\t" + (char)i );
      System.out.println();
    }
    
  } // end main method
  
} // end class