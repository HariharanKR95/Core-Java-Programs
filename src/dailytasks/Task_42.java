
package dailytasks;

import java.util.Scanner;

public class Task_42 {

	public static void main(String[] args) {

		int num1, num2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the numbers");

		num1 = sc.nextInt();

		num2 = sc.nextInt();

		System.out.println("Enter the operator (+,-,*,/)");

		char op = sc.next().charAt(0);

		int o = 0;

		switch (op) {

		case '+':

			o = num1 + num2;

			break;

		case '-':

			o = num1 - num2;

			break;

		case '*':

			o = num1 * num2;

			break;

		case '/':

			o = num1 / num2;

			break;

		default:

			System.out.println("You enter wrong input");

			break;
		}

		System.out.println("The final result:");

		System.out.println();

		System.out.println("Calucater answer:"+num1 + " " + op + " " + num2 + " = " + o);
	}
}
