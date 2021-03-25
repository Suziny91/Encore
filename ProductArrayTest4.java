package com.encore.test;

import com.encore.service.OutletStoreService;
import com.encore.vo.Customer;
import com.encore.vo.Product;
//OutletStoreService�� Hasing�Ǵ� Test Class...
public class ProductArrayTest4 {

	public static void main(String[] args) {
		//service��ü ����...service Ŭ���� ��ɵ��� �޸𸮿� �ø���.
		OutletStoreService service = new OutletStoreService();
		
		Product [] product1 = {
				new Product("���Ӹ���Ǫ", 23000, 2, "LG"),
				new Product("���ֻ�ټ�", 2000, 7, "HP"),
				new Product("�Ŷ��", 1200, 10,"Samsung"),
				new Product("ĹŸ��",340000 ,1, "LG")
		};
		
		Product [] product2 = {
				new Product("�׿�ġ��", 23000, 2, "CJ"),
				new Product("�����", 2000, 2, "���"),
				new Product("�Ŷ��", 1200, 10,"���"),
		};
		
//		Customer[] customers = new Customer[2];
//		customers[0] = new Customer(111, "�̳���", "��赿");
//		customers[1] = new Customer(222, "����", "��赿");
		
		Customer[] customers = {
				new Customer(111, "�̳���", "��赿"),
				new Customer(222, "����", "��赿")
		};
		
		customers[0].buyProducts(product1);
		customers[1].buyProducts(product2);
		
		///////////////////�Ʒ������ʹ� Service�� ����� ȣ���� ���Դϴ�.////////////////
		System.out.println("======��赿 ���� ���Դϴ�.==========");
		Customer[] cust = service.getCustomer(customers, "��赿");
		for(Customer c : cust) 
			System.out.println(c.getDetail());
				
		
	}
}
