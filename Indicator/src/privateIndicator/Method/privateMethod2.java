package privateIndicator.Method;

public class privateMethod2 {
	public static void main(String[] args){
	//2. ���� Ŭ�������� �ν��Ͻ� �޼ҵ�� static�޼ҵ�  ȣ��.
		privateMethod2 pv1 = new privateMethod2();
		pv1.test1();
		privateMethod2.test2();
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