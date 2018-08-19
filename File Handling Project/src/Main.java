import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main {
	
	public static void main(String []args) throws IOException {
		try {

			
			System.out.println("Enter some text to be saved to a text file:");
			//Get user input
			Scanner sc = new Scanner(System.in);
			String userInput = sc.nextLine();
			
			//Writes user input to txt file (false value means it overwrites previous file contents)
			FileWriter writer = new FileWriter("UserInput.txt", false);
			writer.append(userInput);
			
			writer.close();
			
			System.out.println("Current text file contents:");
			//Reads file contents if it exists
			File doesExist = new File ("UserInput.txt");
			if (doesExist.exists()) {
				FileReader fr = new FileReader("UserInput.txt");
				int character;
				while((character = fr.read())!= -1) {
					System.out.print((char)character);
				
				}
				fr.close();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
