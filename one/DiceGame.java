package com.java.one;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args)throws IOException {
		// ȭ�鿡 �ֻ����� �����ּ���
//		����ڴ� ����
//		ȭ�鿡 ����� ��ȣ�� ��µǰ�
//		��ǻ�Ͱ� �ֻ����� �������
//		����� ����
//		��ǻ�Ͱ� ���� �ֻ��� ���ڰ� ��µǰ�
//		���� ���ڰ� win, lose, draw
		//���� �ݺ�
		
		Scanner sc=new Scanner(System.in);
		Random ran=new Random();
		
		while (true) {
			
		System.out.println("ȭ�鿡 �ֻ����� �����ּ���");
		sc.nextLine();
	
		int ranA=ran.nextInt(6)+1;
		System.out.println("����� ��ȣ : "+ranA);
		
		System.out.println("��ǻ�Ͱ� �ֻ����� �������?");
//		sc.nextLine();//enter
		System.in.read();
		
		int ranB=ran.nextInt(6)+1;
		System.out.println("��ǻ�� ��ȣ : "+ranB);
		
		if (ranA>ranB) 
			System.out.println("����� �¸�");
		else if (ranA<ranB) 
			System.out.println("��ǻ�� �¸�");
		else 
			System.out.println("���º�");
		
		}
	}

}
