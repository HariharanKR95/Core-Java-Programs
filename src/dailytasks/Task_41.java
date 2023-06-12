package dailytasks;

import java.util.Scanner;

public class Task_41 {
	 public static void main(String[] args)     {
	        //Take input from the user
	        //Create object of Scanner class
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the numbers ");
	        System.out.println("Enter the dividend: ");
	        int num1=sc.nextInt();  //Initialize the number
	        System.out.println("Enter the divisor: ");
	        int num2=sc.nextInt();  //Initialize the number
	        int quotient = num1 / num2;
	        int remainder = num1 % num2;
	        System.out.println("After division the quotient and remainder are:");
	        //Print the Quotient 
	        System.out.println("The quotient is: " + quotient);
	        System.out.println("The remainder is: " + remainder);
	    }
}
