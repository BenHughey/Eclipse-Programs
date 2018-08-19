
public class DotCom {
	private int locationCells[];
	private int numOfHits = 0;
	
	public void setLocationCells(int[] locs) {
		locationCells = locs;
	}
	
	public String checkYourself(String stringGuess) {
		
		//Convert string to int
		int guess = Integer.parseInt(stringGuess);
		
		//variable to hold result we return
		String result = "miss";
		
		//repeat with each cell in the locationCells array
		for (int cell : locationCells) {
			if (guess == cell) {
				result = "hit";
				
				numOfHits++;
				
				break;
			}
		}
		
		//check if we're dead
		if (numOfHits == locationCells.length) {
			result = "kill";
			
		}
		System.out.println(result);
		
		return result;
	}
	
}
