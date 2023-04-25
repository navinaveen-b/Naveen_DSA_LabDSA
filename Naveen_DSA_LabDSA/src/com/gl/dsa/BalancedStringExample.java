package com.gl.dsa;
import java.util.Scanner;
public class BalancedStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		Scanner sc = new Scanner(System.in);
		BalancedString bs = new BalancedString();
		System.out.println("Enter input string for check");
		input = sc.nextLine();
		if(bs.balancedString(input))
			System.out.println("Input string" + " " + input + " " + "is balanced");
		else
			System.out.println("input string" + " " +input + " " + "is not balanced");

		sc.close();
	}

}
