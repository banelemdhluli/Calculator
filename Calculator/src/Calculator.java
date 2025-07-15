import java.util.Scanner;

public class Calculator{

public static void main(String[]args) {

   Scanner input = new Scanner(System.in); // create Scanner object

   while(true){
       // Ask user for the first number
       System.out.print("Enter first number or type 'exit' to quit: ");
       String firstNumber = input.next();

       if(firstNumber.equalsIgnoreCase("exit")) {
           System.out.println("Calculator exiting...");
           break;
       }

       // Convert first input to double
       // Use try catch because the user might enter
       // something that might cause an error
       double num1;

       try{
           num1 = Double.parseDouble(firstNumber);
       }catch (NumberFormatException e){
           System.out.println("Invalid input. Try again");
           continue;
       }

       // Ask user for the operator
       System.out.print("Enter an operator (+,-,*,/): ");
       String operator = input.next();

       // Ask user for the second number
       System.out.print("Enter second number: ");
       String secondNumber = input.next();

       if(secondNumber.equalsIgnoreCase("exit")){
           System.out.println("Calculator exiting...");
           break;
       }
       // Convert second input to double
       // Use try catch because the user might enter
       // something that might cause an error
       double num2;

       try{
           num2 = Double.parseDouble(secondNumber);
       }catch (NumberFormatException e){
           System.out.println("Invalid input. Try again");
           continue;
       }

       // Perform the calculation
       switch(operator){
           case "+":
               System.out.println("Result: " + (num1 + num2));
               break;
           case "-":
               System.out.println("Result: " + (num1 - num2));
               break;
           case "*":
               System.out.println("Result: " + (num1 * num2));
               break;
           case "/":
               if(num2 == 0){
                   System.out.println("Cannot divide by zero");
               }else{
                   System.out.println("Result: " + (num1 / num2));
               }
               break;
           default:
               System.out.println("Invalid operator. Try again");
               continue;

       }
       System.out.println();
   }
   input.close();
}
}



