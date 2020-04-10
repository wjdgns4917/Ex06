package com.java.one;

public class MethodTest {
	public void makeSum() {
		System.out.println("메소드에서 출력");
	}
	public static void main(String[] args) {
		//자바에서는 함수를 메소드라 한다.
//		형태 
//		public vpid 메소드 이름() {}
		
		//객체 생성
		MethodTest mt=new MethodTest();
		mt.makeSum();//호출
	}
	
		
}


