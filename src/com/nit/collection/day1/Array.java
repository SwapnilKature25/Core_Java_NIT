package com.nit.collection.day1;
import java.util.Arrays;
class Array {
	public static void main(String args[]) {
		int array[] = new int[5];
		for (int i = 5; i > 0; i--)
			array[5 - i] = i;
		Arrays.fill(array, 1, 4, 8);
		for (int i = 0; i < 5; i++)
			System.out.print(array[i]);
	}
}


/* // Initializing array in reverse order (i = 5 to 1)
        for (int i = 5; i > 0; i--)
            array[5 - i] = i;  // Stores 5,4,3,2,1 in the array
        
        // Filling array indices from 1 to 3 (inclusive) with 8
        Arrays.fill(array, 1, 4, 8);
        
        // Printing final array
        for (int i = 0; i < 5; i++)
            System.out.print(array[i]);
   */