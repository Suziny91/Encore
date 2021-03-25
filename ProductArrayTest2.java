package com.encore.test;

import com.encore.vo.Product;
//��ɵ��� �߰��� ���ڽ��ϴ�.
public class ProductArrayTest2 {

	public static void main(String[] args) {
		// 1.Product Type�� �迭�� 3�� ����
		// 2.Product�� 3�� ����
		// 1, 2�� �ѹ��� �Ͻñ� �ٶ��ϴ�.
		
		//3. for���� �̿��ؼ� Product ������ ���
		
		Product [] product = {
				new Product("���Ӹ���Ǫ", 23000, 2, "LG"),
				new Product("���ֻ�ټ�", 2000, 7, "HP"),
				new Product("�Ŷ��", 1200, 10,"Samsung"),
				new Product("ĹŸ��",340000 ,1, "LG")
		};
		//1. ��ǰ���� ����Ŀ�� ����մϴ�
		System.out.println("================��ǰ���� ����Ŀ�� ����մϴ�================="); 
		for(Product p : product)
			System.out.println(p.getMaker());
		
		System.out.println("================10���� �̻��ϴ� ��ǰ���� ����մϴ�================="); 
		for(Product p : product) {
			if(p.getPrice()>=100000)
			System.out.println(p.getDetail());
		}
		
		//3.������ ���ǵ��� �Ѱ���
		System.out.println("================�� ���� ������ ����մϴ�================="); 
		for(Product p : product) {
		int total = 0;  total += p.getPrice()*p.getQuantity();
			System.out.println("Total Price "+ total+ "��");
		}
	
	}	
		 

}
