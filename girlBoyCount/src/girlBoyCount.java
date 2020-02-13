//*******************************************************************
//  ITC 115 - Assignment 6 - Ch6, Ex1: boyGirl method
//  
//  Write a method named boyGirl that accepts a Scanner as a parameter.
//  The Scanner is reading its input from a file containing a series of
//  names followed by integers. The names alternate between boys' names
//  and girls' names. Your method should compute the absolute difference
//  between the sum of the boys' integers and the sum of the girls' integers.
//  The input could end with either a boy or girl; you may not assume that
//  it contains an even number of names.
//  
//  It should produce the following output, since the boys' sum is 27 and
//  the girls' sum is 32:
//
//  4 boys, 3 girls
//  Difference between boys' and girls' sums: 5
//
//By: Mike Gilson
//Date: 2/13/2020
//*******************************************************************

// import functionality for Scanner Objects and File objects
import java.util.*;
import java.io.*;

public class girlBoyCount {

//  define main method with a throws exception, since we are working with a file
	public static void main(String[] args) throws FileNotFoundException {
		
//  Define a new Scanner object called "input" that is accessing the File object
//    titled "boysgirls.txt"		
			Scanner input = new Scanner(new File("boysgirls.txt"));

//  Call the boyGirl method, with input as a parameter
			boyGirl(input);
		} // end main method
	
	
//  Define boyGirl method, requiring Scanner as a parameter, named as "file"	
		public static void boyGirl (Scanner file) {
			
//  Declare and initialize needed variables:
			int bsum = 0;  		// Boys Sum
			int gsum = 0;		// Girls Sum
			int linecount = 0;	// Line Count
			int bcount = 0;		// Count of Boys
			int gcount = 0;		// Count of Girls
			
//  Set up a while loop to determine actions as long as there is another token
//   in the file. Then iterate the line counter. If the line count is odd, token
//   is registered and the Girl Counter iterates by one. While there is an Integer
//   token after it, that integer is added the Girls Sum.
//  Meanwhile, if the line count is even, token is registered and the Boy Counter
//   iterates by one.  While there is an Integer token after it, that integer is
//   added to the Boys Sum. 
//  With only one integer per line, the inner while statement ends, but the outer
//   while loop continues, thus iterating the line count for the if statement for
//   each line.  The If statement thus separates Boys/Girls and their respective sums.
				while (file.hasNext() ) {
					linecount++;
					
					if (linecount %2 == 0) {
						file.next();
						gcount++;
						while (file.hasNextInt() ) {
							gsum += file.nextInt();
							
						} // end if/while inner statement
						
					} else {
						file.next();
						bcount++;
						while (file.hasNextInt() ) {
							bsum += file.nextInt();
						
						} // end else/inner while statement
					} // end else statement	
				} // end outer while statement
			
//  Once Outer While statement completes, display to console the results of
//   the counts: Count of Boys and Girls, as well as the difference between
//   the Boys and Girls sums, using the absolute value of their difference.
				System.out.println(bcount + " boys, " + gcount + " girls");
				System.out.println("Difference between boys' and girls' sums: "
						+ Math.abs(bsum - gsum));
			
		} // end boyGirl method
} // end girlBoyCount class
	
	
 