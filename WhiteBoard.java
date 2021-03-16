package com.encore.datatype;

/*
 * 1.�ʵ�
 * 	int ������, char �÷�, float ����, String ����ȸ��, String ����, 
 *  ��ũ��ġ ���θ� �� �� �ִ� �ʵ带 �߰�
 * 2.�޼ҵ�
 * 	2�� ����
 * 	- �ʵ� ���� Test Ŭ�������� �޾Ƽ� �ʵ忡 �Է��ϴ� ���
 * 	- �ʵ忡 �Էµ�, ����� ���� �ܼ�â���� ����ϴ� ��� 
 * ------------------------------------------------
 * 1.
 * ������ ���Ǵ� ��ġ�� ���� �ʵ�� ����v�� ���еȴ�)
 * �ʵ� --> Ŭ���� ���� �ٷ� ��, �޼ҵ� ��� �ٱ�
 * Local V(����)-->�޼ҵ� �ȿ��� ����
 * 
 * 2.
 * 
 */

public class WhiteBoard {
	// field
	public int size;
	public char color;
	public float price;
	public String company;
	public String material;
	public boolean scratch;

	public void setInfo(int size, char color, float price, String company, String material, boolean scratch) {
		// �ʵ�� ���ú����� �̸��� ���� ��, �����ϱ� ���ؼ� �ʵ� �տ� this�� ���δ�.
		// this�� �ش�Ŭ���� �ڱ��ڽ�...������ �ϴ� �ؼ�...
		this.size = size;
		this.color = color;
		this.price = price;
		this.company = company;
		this.material = material;
		this.scratch = scratch;
	}

	public void printInfo() {
		System.out.println(size + "\t" + color + "\t" + price + "\t" + company + "\t" + material + "\t" + scratch);
	}

}
