/* La Verdad Christian College
 * Name: Jennelyn L. Bantucan
 * BS Information Systems 2

 * Title: Fibonacci Series using Java
 */

import java.util.Scanner;

public class Fibonacci {

	public static void main (String[] args) {
		int limit = 10;

        //number of elements to generate in a series
		long[] series = new long[limit];

      //create first series elements
		series[0] = 0;
		series[1] = 1;

		//create the Fibonacci series and store it in an array
		for(int i = 2; i < limit; i++) {
			series[i] = series[i-1] + series[i-2];
		}
		//print the Fibonacci series numbers
		System.out.println("Fibonacci Series up to " + limit);
		for(int i=0; i<limit; i++) {
			System.out.print(series[i] + " ");
		}
	}

}
