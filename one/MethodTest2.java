package com.java.one;

public class MethodTest2 {
	public void makeSum() {
		int start=0;
		int end=100;
		int sum=0;
		//���
		for (int i = start; i <= end; i++) {
			sum+=i; //sum=sum+i
		}
		//������
		System.out.println("���� : "+start);
		System.out.println("���� : "+end);
		System.out.println("�հ� : "+sum);
	}
	public static void main(String[] args) {
		//�ڹٿ����� �Լ��� �޼ҵ�� �Ѵ�.
//		���� 
//		public vpid �޼ҵ� �̸�() {}
		
		//��ü ����
		MethodTest2 mt=new MethodTest2();
		mt.makeSum();//ȣ��
	}
	
		
}


