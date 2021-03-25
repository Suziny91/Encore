package com.encore.service;

import com.encore.vo.Product;

/*
 * ProductStore�� �ִ� �پ��� ��ǰ���� �ٷ�� 
 * ��ɸ��� ��Ƴ��� Ŭ����
 * �̷� ��ɸ����� �ۼ��� Ŭ������ ����(Manage) Ŭ������ �Ѵ�.
 * 
 * �� Ŭ�������� �ٷ�� ��ɵ�
 * 1)�پ��� ��ǰ���� ����Ŀ�� ����ϴ� ���
 * 2)��ǰ���� �� ���Ծ��� �����ϴ� ���
 * 3)Ư�� �ݾ� �̻��� �Ǵ� ��ǰ�� �����ϴ� ���
 * 4)Ư��ȸ�� ��ǰ���� �����ϴ� ���
 * 5)������ ��ǰ�� ��հ��� �����ϴ� ���
 * --->����� Identifier �����ϴ� ����� �Բ�
 */

public class ProductStoreService {
	//1)�پ��� ��ǰ���� ����Ŀ�� ����ϴ� ���
	public void printAllProductMaker(Product[] pros) {
		for(Product p : pros) System.out.println(p.getMaker());
	}
	//2)��ǰ���� �� ���Ծ��� �����ϴ� ���
	public int getTotalPrice(Product[] pros ) {
		//����
		int total = 0;
		for(Product p : pros) total += p.getPrice()*p.getQuantity();
		return total;
	}
	//3)Ư�� �ݾ� �̻��� �Ǵ� ��ǰ�� �����ϴ� ���
	public Product[] getMorePrice(Product[] pros, int price) {
		Product[] temp = new Product[pros.length];
		int idx = 0;
		for(Product p : pros) {
			if(p.getPrice()>=price) 
				temp[idx++] = p;
				//idx++;
		}
		return temp;
	}
	//4)Ư��ȸ�� ��ǰ���� �����ϴ� ���
	public Product[] getCertainCompany(Product[] pros, String company) {
		Product[] temp = new Product[pros.length];
		int idx = 0;
		for(Product p : pros) {
			if(p.getCompany().equals(company))
				temp[idx++] = p;
		}	
		return temp;
	}
	//5)������ ��ǰ�� ��հ��� �����ϴ� ���
	   
//	1.
//		public int getAvgPrice(Product[] pros) {
//	
//		return getTotalPrice(pros)/pros.length;
//		
//	}
	
	//2.
//	public int getAvgPrice(Product[] pros) {
//		Product [] temp = new Product[pros.length];
//		int total = 0;
//		int idx = 0;
//		for(Product p : pros) {
//	       temp[idx++]= p;
//		   total += p.getPrice();
//		}		   
//			return total/pros.length;
//  }
	//3.
	public int getAvgPrice(Product[] pros) {
		int total = 0;
		for(Product p : pros) {
	       total += p.getPrice();
		}		   
		return total/pros.length;
	}
	
}
