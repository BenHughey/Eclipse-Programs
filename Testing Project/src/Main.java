import java.util.Scanner;

public class Main {
 /*
 * main runs the calculator
 */
 public static void main(String[] args) {

// an object of the BasicCalculator class
 BasicCalculator bc = new BasicCalculator();

 // welcome the user to the program
 System.out.println("SIMPLE CALCULATOR\n----------------------");

 // initialize the scanner
 Scanner input = new Scanner(System.in);

 // declare the sentinel
 boolean keepGoing = true;
 // start the main program loop
 while (keepGoing == true) {

 // let create an exception handler
 try {
 // prompt for first input
 System.out.println("Enter the first number");
 double firstNumber = input.nextDouble();

 // prompt for operator
 System.out.println("Enter the operator (+ or - or * or / )");
 String operator = input.next();

 // prompt for second input
 System.out.println("Enter the second number");
 double secondNumber = input.nextDouble();

 // print the result using the calculate method from the BasicCalculator class
 System.out.println("The result is " + bc.calculate(firstNumber, secondNumber, operator));
 }

 // catch exceptions (should be invalid number only as operator is
 // string e.g. anything
 catch (Exception ex) {
 System.out.println("You entered an invalid number");
 }

 // 'clear' the scanner
 input.nextLine();

 // check if they want to go again
 System.out.println("Go again? (Y to continue, or anything else to quit");
 String checkAgain = input.next();

 // if the don't want to continue, exit
 if (!checkAgain.toUpperCase().contains("Y")) {
 System.out.println("--------------------\nGOODBYE");
 keepGoing = false;
 }
 }
 }
}
