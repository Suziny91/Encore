package com.encore.test1;

import java.util.Scanner;

public class Patter369Test {

	/* 
	 * Scanner��ü�� ���ؼ� 
	 * 10~99 ������ ��Ҹ� �ϳ� �Է¹޴´�.(2�ڸ��� ����)
	 * 
	 * 3,6,9...�� 3�� ������� ���ԵǾ��� �ִ����� �������� �����ϴ� �˰���
	 * �ϳ� ������ @
	 * �ΰ� ������ @@
	 * ������ ����
	 * 
	 * ���� �� 
	 * 31 ->@
	 * 11->11
	 * 98->@
	 * 96->@@
	 * 
	 * ��Ʈ 
	 * 2�ڸ� �� 
	 * ���ڸ�  -->/
	 * ���ڸ�  -- >%
	 * 
	 * ��� �����ϱ�
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0; i<100; i++) {
		int number = sc.nextInt();
				
	    int a = number/10; 
	    int b = number%10;
	  
	    if(a==3|a==6|a==9) {
		  if(b==3|b==6|b==9)
			  System.out.println("@@");
		  else 
			  System.out.println("@");
	  }else {
		  if(b==3|b==6|b==9)
			  System.out.println("@");
		  else 
			  System.out.println(number);
	   }
	    
	  }
	}
}
