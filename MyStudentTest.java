package sample.test;

import sample.MyStudent;
/*
 * MyGreet Ŭ������ �޼ҵ带 ���۽�Ű�� ���� Ŭ����...TestŬ����
 * 1. Ŭ���� ��ü�� ����==�ı�(�������)���� �޸𸮿� �ö󰣴�
 * 2. ����
 *  1)�ʵ�--- ���Ҵ�
 *  2)�޼ҵ�---ȣ��(Calling)
 */
public class MyStudentTest {

	public static void main(String[] args) {
		MyStudent ms = new MyStudent(); //1
		//2
		ms.name = "������";
		ms.age = 25;
		ms.adress = "���ʵ�";
		//���� �ڵ尪�� �������� �Ǹ� �ϵ��ھ� �� �� ����.
		ms.printInfo(); 
	
	}

}
