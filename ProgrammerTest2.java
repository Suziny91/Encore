package com.encore.cons.test;

import com.encore.cons.Programmer2;
import com.encore.util.MyDate;

public class ProgrammerTest2 {

	public static void main(String[] args) { 
		// 1.��ü ���� --> �޸� �Ҵ� / Programmer�� �ı����� �޸𸮿� �ø���.
		// 2.�޼ҵ� ȣ��-->
		// 3.�������� ������ �ܼ�â�� ��µǵ��� �ۼ�
		// birthday�� ������ 1980-1-1
	Programmer2 pro = new Programmer2();
	Programmer2 pro1 = new Programmer2();
	
	MyDate md = new MyDate();
	md.setDate(1980, 1, 1);

	pro.setProgrammer("James",md, 300000.0F, 10000);//�ʵ忡 ���� ����
	System.out.println(pro.getProgrammer());//���Ե� ���� �޾ƿ�(Calling)
	
	pro1.setProgrammer("Peter",md, 400000.0F, 20000);//�ʵ忡 ���� ����
	System.out.println(pro1.getProgrammer());//���Ե� ���� �޾ƿ�(Calling)
	
	pro = pro1;
	
	System.out.println(pro.getProgrammer());//���Ե� ���� �޾ƿ�(Calling)
	System.out.println(pro1.getProgrammer());//���Ե� ���� �޾ƿ�(Calling)
	
	}

}
