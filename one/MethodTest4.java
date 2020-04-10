package com.java.one;

public class MethodTest4 {
	
	public static void main(String[] args) {
//		문자와 숫자 전달
		
		//자신의 객체생성 mt4
		MethodTest4 mt4=new MethodTest4();
		
//		메소드를 만드세요 whoMsg
//		whoMsg 메소드를 호출하세요
		mt4.whoMsg("홍길동선물",100);
	}
	public void whoMsg(String msg,int won) {
		System.out.println(msg +" "+won);
		if (won>50000) {
			System.out.println("Gooooooood");
		}
		else if (won>30000) {
			System.out.println("Normaaaaal");
		}
		else if (won>20000) {
			System.out.println("~~~~~~~~~~");
		}
		else
		 System.out.println("Fuckkkkkkkkk");
	}	
}


