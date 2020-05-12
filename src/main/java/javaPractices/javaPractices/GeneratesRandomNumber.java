package javaPractices.javaPractices;

import java.util.Random;

public class GeneratesRandomNumber {

	public static void main(String[] args) {
	      int counter;
	      Random randomnum = new Random();
	      /* Below code would generate 5 random numbers
	       * between 0 and 200.
	       */
	      System.out.println("Random Numbers:");
	      
	      for (counter = 1; counter <= 5; counter++) {
	         System.out.println(randomnum.nextInt(20000));
	      }
	   }
}
