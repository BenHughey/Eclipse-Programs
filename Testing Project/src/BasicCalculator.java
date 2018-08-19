public class BasicCalculator {

 /*
 * calculate
 * @param double a the first number
 * @param double b the second number
 * @param String operator a textual representation of the operator
 */

 public double calculate(double a, double b, String operator) {
 double result = 0;
 switch (operator) {

 // handle addition
 case "plus":
 // cascade
 case "+":
 result = a + b;
 break;

 // handle the subtraction
 case "minus":
 // cascade
 case "-":
 result = a - b;
 break;

 // handle multiplication
 case "multiply":
 // cascade
 case "*":
 result = a * b;
 break;

 // handle division
 case "divide":
 // cascade
 case "/":
 result = a / b;
 break;

 default:
 System.out.println("You entered an invalid operator");
 }
 return result;
 }
}
