package com.java.one;

public class MethodTest2 {
	public void makeSum() {
		int start=0;
		int end=100;
		int sum=0;
		//계산
		for (int i = start; i <= end; i++) {
			sum+=i; //sum=sum+i
		}
		//결과출력
		System.out.println("시작 : "+start);
		System.out.println("종료 : "+end);
		System.out.println("합계 : "+sum);
	}
	public static void main(String[] args) {
		//자바에서는 함수를 메소드라 한다.
//		형태 
//		public vpid 메소드 이름() {}
		
		//객체 생성
		MethodTest2 mt=new MethodTest2();
		mt.makeSum();//호출
	}
	
		
}


