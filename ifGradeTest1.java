package com.encore.test;

import java.util.Scanner;

/*
 * ���
 * :
 * ������ ������ �� ������ �����ϵ��� �����ϴ� ����.
 * 1)if / if~else / else
 * 	int i=1;
 *  int (i!=1) { //i=1���� ������ ���� ����( =�� ������ �ƴ϶� �Ҵ��� �ǹ��ϱ� ������). i != 1 �̷��� �־ ���� ���� (���ǿ� �ִ� ������ true�� ���� �����Ѵ�)
 * 	   //code block1
 * } else if(i==1){
 * 		//code block2
 * } else if(i==2){
 * 		//code block3
 * } else {
 * 		//code block4
 * }
 *  
 * 2)switch
 * : �ش��ϴ� Case�� ������ �����ϵ��� �����Ѵ�.
 * switch(grade){
 * 		case 90:
 * 		case 95:
 * 			System.out.println("A grade...");
 * 		break; --> break�� �ش� ���̽��� ���������� switch�� ����������.
 * 		
 * 		case 80:
 * 		case 85:
 * 			System.out.println("B grade...");
 * 		break;
 * 
 *		default; //if���ǹ����� else�� ���� �ǹ�
 *		System.out.println("try Again ");
 *		(break;)
 * }//
 * 
 * 
 */
public class ifGradeTest1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ���輺���� �Է��ϼ���>>>");
		
		int score = sc.nextInt();
		
		if(score<100 && score>=90) {
			System.out.println("A grade...");
	    }else if (score<90 && score >=80) {
	   		System.out.println("B grade...");
	    }else if (score<80 && score >=70) {
	   		System.out.println("C grade...");
	    }else if (score<60 && score >=50) {
	   		System.out.println("D grade...");
	    }else {
	   		System.out.println("Try Again....");
	   	
	   		//if(score<100 && score>=90)
				//System.out.println("A grade...");
		    //else if (score<90 && score >=80) 
		   		//System.out.println("B grade...");
		    //else if (score<80 && score >=70) 
		   		//System.out.println("C grade...");
		   // else if (score<60 && score >=50) 
		   		//System.out.println("D grade...");
		    //else 
		   		//System.out.println("Try Again....");	
	   		//--->statement�� ������ ���� '{','}' ���������ϴ�
	   	
	    }
	}

}
