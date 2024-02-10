package App;

import java.util.Scanner;

import Service.MyStack;

public class Driver {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string of parenthesis");
		String s = sc.next();
		MyStack ms= new MyStack();
		if(ms.checkParanthesis(s))
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered String do not contain Balanced Brackets");

	}
}
