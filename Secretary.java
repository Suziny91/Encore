package com.encore.child;

import com.encore.parent.Employee;
import com.encore.util.MyDate;

public class Secretary extends Employee{

	public String bossOfName;
	
	public Secretary(String name, MyDate birthDay, double salary, String bossOfName) {//�ڽ��� �����Ƿ��Ҷ�...
		//�θ� �⺻ ������ ȣ���� ���⼭ ������ �Ͼ��....super();
		super(name, birthDay, salary);
		this.bossOfName=bossOfName;
	}
	
	public String getDetails() {
		return super.getDetails() +","+bossOfName;
	}

	public void changeBossOfName(String bossOfName) {
		this.bossOfName = bossOfName;
	}
	
	
	
}


