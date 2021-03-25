package com.encore.test;

import com.encore.service.ProductStoreService;
import com.encore.vo.Product;
//��ɵ��� �߰��� ���ڽ��ϴ�.
public class ProductArrayTest3 {

	public static void main(String[] args) {
		//service��ü ����...service Ŭ���� ��ɵ��� �޸𸮿� �ø���.
		ProductStoreService service = new ProductStoreService();
		
		Product [] product = {
				new Product("���Ӹ���Ǫ", 23000, 2, "LG"),
				new Product("���ֻ�ټ�", 2000, 7, "HP"),
				new Product("�Ŷ��", 1200, 10,"Samsung"),
				new Product("ĹŸ��",340000 ,1, "LG")
		};
		
	System.out.println("==========1. ��� ��ǰ�� ����Ŀ�� ����մϴ�.===========");
	service.printAllProductMaker(product);
	
	System.out.println("==========2. ��� ��ǰ�� �� ���Ծ��� �޾ƿɴϴ�.===========");
	//int total = service.getTotalPrice(product);
	//System.out.println(total+"��");
	
	System.out.println(service.getTotalPrice(product)+"��");

	System.out.println("==========3. 10000�� �̻��� ��ǰ���� �޾ƿɴϴ�.===========");
	//1
	Product[] returnPros = service.getMorePrice(product, 10000);
	for(Product p : returnPros) {
		if(p==null) continue;
		System.out.println(p.getDetail());
	}
	//2
	//System.out.println("10000�� �̻��� ��ǰ��" + service.getMorePrice(product, 10000));
	
	//3
//	for(Product p : service.getMorePrice(product, 10000)) {
//		if(p != null)
//			System.out.println(p.getDetail());			
//	}
//		
		//System.out.println(p.getDetail());
	
	
	System.out.println("==========4.������ ȸ�� ��ǰ���Դϴ�..===========");
	Product[] returnPros1 = service.getCertainCompany(product, "LG");
	for(Product p : returnPros1) {
		if(p==null) continue;
		System.out.println(p.getDetail());
	}
	
	System.out.println("==========5.��ǰ���� ��հ��Դϴ�...===========");
	
	System.out.println(service.getAvgPrice(product)+"�� �Դϴ�.");
	}	 

}
