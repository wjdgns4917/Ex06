package com.java.two;

import java.nio.charset.MalformedInputException;
import java.util.Scanner;

public class InputMethod {

		// �ֿܼ��� �ΰ��� ���� �Է��ؼ�
		// ����� �޼ҵ�(twoNumSum)���� ���
		// ����� ��µǵ���
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1, num2;
		System.out.println("�μ��Է� : ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		InputMethod im=new InputMethod();
		im.twoNumSum(num1,num2);
	
	}
	public void twoNumSum(int num1, int num2) {
		System.out.println("�μ��� �հ�� : "+(num1+num2));
	}

}
