package com.encore.test1;

import java.util.Scanner;

/*
 * ����� ����� �˰����� �����ϰ� �ٷﺸ��
 * 
 * 
 */
public class CatchAMouseTest {
	
	private static String algoSolv(int cata, int catb, int mouse) {
		
		// if, else if, else ������ abs()�� �̿��ؼ� �˰����� �����ϼ���!!
		
		if (Math.abs(cata-mouse)<Math.abs(catb-mouse)) {
			return "catA Catch!";
		}else if (Math.abs(cata-mouse)>Math.abs(catb-mouse)) {
			return"catb Catch!";
		}else {
			return "Mouse Escapes!!";
		}
			
		
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//������� 3���� ���� �Է¹޴´�.
		int cata = sc.nextInt();
		int catb = sc.nextInt();
		int mouse = sc.nextInt();
		
		String result = algoSolv(cata, catb, mouse);
		
		System.out.println("Result ::"+result);
	}
	
	

}
