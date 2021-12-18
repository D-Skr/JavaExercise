package main;

import java.util.Scanner;

public class Simple_Calc {

	public static void main(String[] args) {
		double num1;
		double num2;
		double ans;
		char op;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		num1 = reader.nextDouble();
		num2 = reader.nextDouble();
		System.out.println("\nEnter an operator (+, -, *, /): ");
		op = reader.next().charAt(0);
		reader.close();
		
		switch(op) {
		case '+': ans = num1 + num2;
			break;
		case '-': ans = num1 - num2;
			break;
		case '*': ans = num1 * num2;
			break;
		case '/': ans = num1 / num2;
			break;
		default: System.out.println("Invalid operator. Please enter correct value");
			return;
		}
		
		System.out.print("\nThe result is: \n");
		System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
	}
}
