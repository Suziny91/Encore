package com.encore.datatype.test;

import com.encore.datatype.WhiteBoard;

/*
 * WhiteBoardtest1... Test,���� Ŭ������� �θ���.
 * 
 * Test,���� Ŭ������ �ϴ� ��
 * 1)��ü�� �����Ѵ� == ��ü�� �������(�ļ�)�� �޸𸮿� �ø���.
 * 2)�ı��� ����
 *   �ʵ� ---���Ҵ�----�������� �ϵ��ڵ��Ǹ� �װ��� ���α׷��� �ƴϴ�..�ϸ� �ȵȴ�...
 *   �޼ҵ�---Calling
 *   
 */
public class WhiteBoardTest1 {

	public static void main(String[] args) {
		/*
		 * WhiteBoard ��ü�� wb��� �̸����� �ϳ� ����
		 * �ʵ忡 ���� �Է�
		 * �Էµ� ���� ���
		 * 
		 * 3�� 15�п� �ٽ� ����
		 * ����
		 * 
		 */

		WhiteBoard wb = new WhiteBoard();
		
		wb.setInfo(100, 'W', 120, "Encore", "Plactic", true);
		
		wb.printInfo();
		
	}

}
