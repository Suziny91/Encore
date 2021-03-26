package com.encore.child;

import com.encore.parent.Employee;
import com.encore.util.MyDate;

/*
 * �θ� Ŭ���� Employee�κ��� ������ �����ް�
 * �ڱ��ڽŸ��� ����� �߰��ϴ� �ڽ� Ŭ����...
 * 
 * ������ ȣ��----> ��ü ����
 * 
 */
public class Manager extends Employee {
		
	// �ڽĸ��� ����� �߰�
	public String dept;
	/*
	 * �ڽ� ������...��ü ���� �˰���
	 * �ڽ� ������{ ù���ο��� ������ �θ�⺻������ ȣ���� �Ͼ��. (super();)
	 */
	public Manager(String name, MyDate birthDay, double salary, String dept) {//�ڽ��� �����Ƿ��Ҷ�...
		//�θ� �⺻ ������ ȣ���� ���⼭ ������ �Ͼ��....super();
		super(name, birthDay, salary);
		this.dept=dept;
	}
	//Method Overriding
	/*
	 * ��Ӱ��迡���� �Ͼ��.
	 * 1step :�θ� ���� ����� �����޴´�.(�θ� ���� ����� ȣ���Ѵ�)
	 * 2step :�װ� �ڽſ� �°� ���ľ���.
	 * 
	 * Overriding�� Rule
	 * 0. ��Ӱ����� �� Ŭ���� ���̿��� �Ͼ��.
	 * 1. �޼ҵ� ����δ� ��� ��ġ
	 * 2. �����δ� �ݵ�� �޶�� �Ѵ�.
	 * --> �ϴ� ���� �޶��������� ���ο� �޼ҵ尡 ���������.
	 *     �޼ҵ� ������
	 */
	
	
	public String getDetails() {
		return super.getDetails() +","+dept;
	}
	//Manager Ŭ�������� ����� �߰�

	public void changeDept(String dept) {
		this.dept = dept;
	}
	
	
	
}
