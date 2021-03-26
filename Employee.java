package com.encore.parent;

import com.encore.util.MyDate;

/*
 * �ڽĵ��� �������� ������ 
 * �Ϲ����� ������ ������ �ִ� �θ� Ŭ����..
 * 
 */
public class Employee {
	//����� ����
	public static final double BASIC_SALARY  = 100.0;
	private String name;
	private MyDate birthDay;
	private double salary;
	
	public Employee() {}// �⺻ ������
	public Employee(String name, MyDate birthDay) {
		this(name, birthDay, BASIC_SALARY );
	}
	public Employee(String name, MyDate birthDay, double salary) {
		super();
		this.name = name;
		this.birthDay = birthDay;
		this.salary = salary;
	}
	
	
	//1step. Object�� ������ �ִ� ����� ���� �޾Ҵ�.
	//2step  �װ� �ڽſ��� �°� ���ľ���.
	@Override
	public String toString() {
		return "Employee [name=" + name + ", birthDay=" + birthDay + ", salary=" + salary + "]";
	}
	

	public String getDetails() {
		return name +","+ birthDay.getDate() +","+salary;
	}
	
	public double getSalary() {
		return salary;
	}
	public static double getBasicSalary() {
		return BASIC_SALARY;
	}
	public String getName() {
		return name;
	}
	public MyDate getBirthDay() {
		return birthDay;
	}
	
	
	
}
