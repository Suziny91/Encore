package com.encore.test;

import com.encore.vo.Product;

public class ProductArrayTest1 {

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
		
		for(Product p : product)
			System.out.println(p.getDetail());
	}

}
