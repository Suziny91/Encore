package com.encore.cons;

import com.encore.util.MyDate;

//������ ������ ��� �ִ� Ŭ����
public class Programmer2 {
	
	//�ʵ� ����
	public String name; //Ŭ����������Ÿ��(API)
	public MyDate birthday; //���� ���� ������Ÿ��(User Definition)
	public float salary;
	public int bonus;
	
	//2. ����
	public void setProgrammer(String name, MyDate birthday, float salary, int bonus) {
		this.name = name;
		this.birthday = birthday;
		this.salary = salary;
		this.bonus = bonus;
	}
	
	
	//3. �ʵ� �� �޾ƿ���
	public String getProgrammer() {
		return name+","+birthday.getDate()+","+salary+","+bonus;
		
	}
	
}
