package sample.test;

import sample.MyStudent2;
/*
 * MyStudentTest.java�� ������
 * ::
 * �л����� �þ������
 * ������ �ʵ忡 �ش��ϴ� ���� ���� �־���� �ϴ� ���ŷο��� �ִ�.
 * 
 * ���α׷��� �ۼ��� �������� �ϵ��ڵ� �Ǿ����� �׷��� �ȵȴ�.
 * ::
 * �ذ�å?
 * 1) �ʵ忡 ���� ���� ������ �ȵȴ�.
 * 2)���� �ʵ忡 �ԷµǴ� ����� ���Ӱ� �ϳ� ����
 * 
 */
public class MyStudentTest2 {

	public static void main(String[] args) {
		/*
		 * 1.MyStudent2 ��ü�� 3�� ����.. m1, m2, m3�̸�����
		 * 2.���� ��ü�� ���� �Ҵ�...�ʵ� �ʱ�ȭ
		 * 3.���� ��ü�� ������ �ܼ�â���� ���
		 */
		MyStudent2 m1 = new MyStudent2();
		MyStudent2 m2 = new MyStudent2();
		MyStudent2 m3 = new MyStudent2();
		
		m1.setField("������",20,"��赿");
		m2.setField("������",30,"���ʵ�");
		m3.setField("������",35,"�Ż絿");
		
		m1.printInfo();
		m2.printInfo();
		m3.printInfo();
	}

}
