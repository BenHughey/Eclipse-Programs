package test;
import java.util.Arrays;
import java.util.Random;


public class ArraysProject {
	
	public static void main(String[] args) {
		
		// Creates new array of integers
		int myArray[] = new int[10];
		
		//loops through array and adds a random integer between 0 and 10
		for (int i = 0; i <10; i++) {
			myArray[i] =(int) Math.round( Math.random() * 10 ); 
			
		}
		
		//Sorts myArray numerically
		Arrays.sort(myArray);
		
		//Searches for number 6 in the array
		int bSearchResult  =  Arrays.binarySearch(myArray, 6); 
		System.out.println("binary search result: " + bSearchResult);
		
		//Prints all array elements to console
		for (int i = 0; i <10; i++) {
			
			System.out.println(myArray[i]);
		}
		
		//Sets value of myArray to null
		myArray = null;
		
		
		//Creates 2D array of char type
		char[][] twoDArray = new char[5][2];
		// variable for generating random numbers
		Random rnd = new Random(); 
		
		//Fills array with elements
		for (int i = 0; i < 5; i++) {
			for (int x = 0; x < 2; x++) {
				twoDArray[i][x] = (char) (rnd.nextInt(26) + 'a');
				
				
				System.out.print(twoDArray[i][x]);
				
				
			}
		}
		
		System.out.println(" ");
		
		
		//Removes the value of the char in row 5 col 2 which is "j"
		twoDArray[4][1] = 0; 
		
		for (int i = 0; i < twoDArray.length; i++ ) {
			for (int x = 0; x < 2; x++) {
				
				System.out.print(twoDArray[i][x]);
			}
		}
		

		
		
		
	}

}
