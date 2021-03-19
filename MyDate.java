package com.encore.capsulation;

/*
 * Encapsulation Pattern
 * 1. �ٸ� Ŭ�������� ���������� ������ �� ������
 *    �ʵ�տ� private ����
 * 2. Ŭ������ �ʵ忡 ������ setter()/getter() �Ѵ�
 *    �׸��� ��׵��� �ٸ� Ŭ���������� ������ �� �ֵ��� public
 *    public void setXx()
 *    public int getXx()
 * 3.setXx() {
 *    ù ���ο���(�ʵ� �ʱ�ȭ �Ǳ� ����!!)��  Ÿ���� ���� ���� �� �ֵ��� ������ �����Ѵ�
 *    
 *    setDay()
 *    ::
 *    1,3,5,7,8,10,12�� ---> 1~31��
 *    2���� 1~28��
 *    4 6 9 11 ���� 1~30��
 *    switch, if
 *    
 *    ::
 *    0�� 22���Դϴ� x
 *    2�� 0�� �Դϴ� x
 */
public class MyDate {
	private int month;
	private int day;
	

	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		//��� 1~12���� �ش��ϴ� ���� ó��..�������� �޼���..
		if(month>=1&&month<=12) {
		this.month = month;
		}
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		//��� 
		//���� ���� day�� �޶�����..
		switch(month) {
		case 2:
			if(day>=1 && day<=28) {
				this.day = day;
			}else {
				System.out.println("�߸��Է�");
				return;
				
			}
			break;
		case 4:
			
		}
		
	}
}
