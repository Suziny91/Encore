package looping.test;

/*
 * �ݺ��� �߿��� ���� ���� ���Ǵ�
 * for���� ��� �����ϴ��� ��Ȯ�ϰ� �����Ѵ�.
 * for(�ʱ��; ���ǽ�; ������)
 */

public class LoopingBasicTest1 {

	public static void main(String[] args) { //��� �ڵ��� �������� main �޼ҵ�
		
		System.out.println("==============for========\n");
		for(int i = 0, j = 0; i<10 & j<10; i++, j++) {
			
			System.out.println("Hello Looping.."+i);
		}//for
		
		
		System.out.println("==============while========\n");
		
		
		int i = 0; //���ú���(main �޼ҵ� �ȿ� ����) , �ʱ�� , ó���� �� �ѹ��� ����
		
		while(i<10) {
			System.out.println("Hello while Looping.."+ i);
			i++;
		}//while
		
		System.out.println("\n==============do while========\n");
		
		
		int j = 10; //1
		do {//2  �ѹ��� ������ ����
			System.out.println(j+"...Always print..");
			j++;
		}while(j<10);//3 ���⼭ ��
		
	}//main

}//class
