package privateIndicator.Method;

public class privateMethod1 {
	public static void main(String[] args){
	//1. ���� Ŭ�������� �ν��Ͻ� �޼ҵ�� static �޼ҵ�  ȣ��.
		privateMethod1 pv1 = new privateMethod1();
		pv1.test1();
		privateMethod1.test2();
	}
	
	void test1(){
		String apple="���";
		System.out.println(apple);
	}
	
	static void test2(){
		String banana="�ٳ���";
		System.out.println(banana);
	}
}