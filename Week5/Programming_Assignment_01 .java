import java.util.Scanner;
  
  public class Question {
  public static void main(String[] args) { 
      int a, b;
      Scanner input = new Scanner(System.in); int result;       
      a = input.nextInt();     
      b = input.nextInt();
       try {             
         result = a/b;          
         System.out.println(result);          
           }
      catch (ArithmeticException e) { 
        System.out.println("Exception caught: Division by zero.");
                              
      }