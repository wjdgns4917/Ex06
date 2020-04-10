package com.java.two;

import java.nio.charset.MalformedInputException;
import java.util.Scanner;

public class InputMethodReturn {

		// Return
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1, num2;
		System.out.println("두수입력 : ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		InputMethodReturn im=new InputMethodReturn();
		int rtot=im.twoNumSum(num1,num2);
		
		System.out.println("두수의 합계는 : "+rtot);

	}
	public int twoNumSum(int num1, int num2) {
		int tot=num1+num2;
		return tot;
	}

}
