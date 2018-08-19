
public class BuggedProgram {
	
	public static void main(String[] args) {
		//anArray size wasn't specified so anArray[i] was referring to a non existent index
		 int[] anArray = new int [11];
		 //variable for size limit of array
		 int limit = 10;
		 //loops through array and gives each index a value from 1 to 10 respectively
		 for(int i = 0; i <= limit; i++) {
		 anArray[i] = i;
		 }
		 //initializing j at limit means it will only loop through once as after that the condition becomes false
		 //initial j value changed to 0
		 for(int j = 0; j <= limit; j++) {
		 System.out.println(anArray[j]);
		 }
		 }

}
