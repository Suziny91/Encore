package com.encore.child;

import com.encore.parent.Employee;
import com.encore.util.MyDate;

public class Engineer extends Employee {
	
	private String tech;
	private int bonus;
	
	public Engineer(String name, MyDate birthDay, double salary, String tech, int bonus ) {//�ڽ��� �����Ƿ��Ҷ�...
		//�θ� �⺻ ������ ȣ���� ���⼭ ������ �Ͼ��....super();
		super(name, birthDay, salary);
		this.tech=tech;
		this.bonus=bonus;
	}
	
	public String getDetails() {
		return super.getDetails() +","+tech;
	}

	//��� �߰�
	public void changeTech(String tech) {
		this.tech = tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public String getTech() {
		return tech;
	}

	public int getBonus() {
		return bonus;
	}
	
	
	
}
