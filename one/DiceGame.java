package com.java.one;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args)throws IOException {
		// 화면에 주사위를 굴려주세요
//		사용자는 엔터
//		화면에 사용자 번호가 출력되게
//		컴퓨터가 주사위를 굴릴까요
//		사용자 엔터
//		컴퓨터가 만들어낸 주사위 숫자가 출력되고
//		높은 숫자가 win, lose, draw
		//무한 반복
		
		Scanner sc=new Scanner(System.in);
		Random ran=new Random();
		
		while (true) {
			
		System.out.println("화면에 주사위를 굴려주세요");
		sc.nextLine();
	
		int ranA=ran.nextInt(6)+1;
		System.out.println("사용자 번호 : "+ranA);
		
		System.out.println("컴퓨터가 주사위를 굴릴까요?");
//		sc.nextLine();//enter
		System.in.read();
		
		int ranB=ran.nextInt(6)+1;
		System.out.println("컴퓨터 번호 : "+ranB);
		
		if (ranA>ranB) 
			System.out.println("사용자 승리");
		else if (ranA<ranB) 
			System.out.println("컴퓨터 승리");
		else 
			System.out.println("무승부");
		
		}
	}

}
