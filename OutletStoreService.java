package com.encore.service;

import com.encore.vo.Customer;
import com.encore.vo.Product;

/*
 * ��ǰ�� �����ϴ� ��,
 * ������ ������ ��ǰ������ �ٷ�� ����� 
 * ��Ƴ��� ���� Ŭ����...
 */
public class OutletStoreService {

	//1. Ư�� ���� ������ ��ǰ������ �����ϴ� ���
	public Product[] getProduct(Customer vo) {
		return vo.getProducts();
	}	
	//2. Ư�� ���� ������ ��ǰ�� maker�鸸 �����ϴ� ���
	public String[] getAllProductMaker(Customer vo) {
	String [] temp = new String[vo.getProducts().length];
	int idx = 0;
	Product[] pros = vo.getProducts(); 
		for(Product p : pros) {
			temp[idx++] = p.getMaker();
		}	
		return temp;
	}	
	
	//3. Outlet�� �ִ� ��� �� ������ �����ϴ� ���
	public Customer[] getAllCustomer(Customer[] custs) {
		Customer[] cust = new Customer[custs.length];
		int idx = 0;
			for(Customer c : custs ) {
				cust[idx++] = c;
			}	
		return cust;
	}
	
	//4. ��� �� �߿� Ư�� ���� �˻�(ã�Ƴ���)�ϴ� ��� - �̸� �Ǵ� �ּҷ� �˻���
		
	public Customer[] getCustomer(Customer[] custs, String nameOrAddress) {
		Customer[] cust = new Customer[custs.length];
		int idx = 0;
		for(Customer c : custs) {
			if (c.getName().equals(nameOrAddress)|c.getAddress().equals(nameOrAddress))
				cust[idx++] = c;
		}
		return cust;
	}
	
	//2. �ֹι�ȣ�� �˻���
	public Customer getACustomer(Customer[] custs ,int ssn) {
		Customer customer = null;
		for(Customer c : custs) {
			if(c.getSsn()==ssn) customer = c;
		}
		return customer ;
	}
	
	//5. Ư�� ���� ������ ���� �� �ְ��� �ش��ϴ� ������ ������ �����ϴ� ���
	public int maxPriceProduct(Customer c) {
		int maxPrice = 0;
		Product[ ] pros = c.getProducts();
		for(Product p : pros) {
			if(p.getPrice()>maxPrice) maxPrice = p.getPrice();
		}
		return maxPrice;
	}
	

	//6. ��� ���� ������ ���� �� Ư������ �̻�Ǵ� ��ǰ�� �����ϴ� ���
	public Product[] getMorePrice(Customer[] custs, int price) {
		int len = 0;
		int cnt = 0;
		for(Customer c : custs )
			len+= c.getProducts().length;
		Product[] temp = new Product[len];
		for(Customer c : custs ) {
			for(Product p : c.getProducts()) {
				if(p.getPrice()>price) temp[cnt++] = p;
			}
		}
		return temp;
	}
	//7. ������ ���׿� ����ִ� ���鸸 �����ϴ� ���
	public Customer[] getSameAddressCustomer(Customer[] custs, String address) {
		Customer[] temp = new Customer[custs.length];
		int idx = 0;
		for(Customer c : custs) {
			if(c.getAddress().equals(address));
			temp[idx++] = c;
		}
		return temp;
	}
	
}




