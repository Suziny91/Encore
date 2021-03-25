package com.encore.vo;
/*
 * ��ǰ�� �����ϴ� 
 * ���� ���� ������ ��� �ִ� voŬ����
 * --------------------------------
 * Product ----> Customer
 * 
 */
public class Customer {

	private int ssn;
	private String name;
	private String address;
	
	private Product[] products;

	
	
	//2. ������ ���...
	public Customer(int ssn, String name, String address) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.address = address;
	}

	public void buyProducts(Product[] products) {
		this.products = products;
	}
	

	public Product[] getProducts() {
		return products;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDetail() {
		return name + "," + address;
	}

	
}
