package com.java.one;

public class MethodTest3 {
	public void makeSum(int sNum, int eNum) {
		int start=sNum;
		int end=eNum;
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
		//�����μ�
		MethodTest3 mt=new MethodTest3();
		mt.makeSum(50,1000);//ȣ��
	}
	
		
}


