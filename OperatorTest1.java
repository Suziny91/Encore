package test;

public class OperatorTest1 {

	public static void main(String[] args) {
		
		int i = 5; //�ݵ�� �ʱ�ȭ�ϰ� ����ؾ� �Ѵ�. ��� �⺻���� ��� �ʱ�ȭ ���ϰ� ���� ����!
		int j = 3;
		
		Operator o1 = new Operator();//�ּҰ� 1000 (����)
		Operator o2 = new Operator();//�ּҰ� 2000
		
		//==(same)
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o1==o2); //false
		System.out.println(o1!=o2); //true
		o1=o2; // =(assign)
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o1==o2);//true
		System.out.println(i != j);//true
		//%...modulus (������ ���� ������)
		System.out.println("������ % :: "+i%j); //2
		System.out.println(i == j);//false
		System.out.println("====================");
		System.out.println(i != j);//true 
		
		//++(1�� ����), --(1�� ����)
		int k = 10;
		System.out.println(k++);// 10--->1�� ���߿� ����
		System.out.println(k); //11
		
		int m = 10;
		System.out.println(++m); //11--->1�� ���� ����
		System.out.println(m);//11
		
		//�� ������
		System.out.println(o1.test1() | o1.test2());// or --->true / �Ѵ� �����ϰ� ��� ����
		System.out.println("================================");
		System.out.println(o1.test2() & o1.test1());// AND --->false
		System.out.println("================================");
		
		//Short circuit (������)
		//���� : �ӵ��� �������� (but, ��� ũ�� �ӵ� ���̾���) 
		//��¥ ������ ���� ��Ȳ�� �ǳʶڴٴ� ��!! �տ��� ����� �������� �ڸ� �������� �ʴ´ٸ� �ڿ� ���׳� ������ �־ �ý��ۿ� ������ ������ �ʱ� ������ 
		System.out.println(o1.test1() || o1.test2());// true �ո� �����ؼ� ����� ������ �ڿ��� �������� ����.
		System.out.println("================================");
		System.out.println(o1.test2() && o1.test1());// false
		
	
	}//main

}//class

class Operator{
	public boolean test1() {
		System.out.println("test1() Calling...");
		return true;
		
	}
	public boolean test2() {
		System.out.println("test2() Calling...");
		return false;
	}
}
