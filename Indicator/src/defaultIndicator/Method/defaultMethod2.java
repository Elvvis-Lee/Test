package defaultIndicator.Method;

public class defaultMethod2 {
	String apple="���";				//��������, ��ü����(�ν��Ͻ� ����)		==> Heap ����
	static String banana="�ٳ���";		//��������, Ŭ��������(static ����)	==> Method Area ����
	
	
	public static void main(String[] args){
		// 2. �ٸ� Ŭ���� ���� �ν��Ͻ� �޼ҵ�� static �޼ҵ� ȣ��.
		Test test = new Test();
		test.test1();
		Test.test2();
	}
}

class Test{
	void test1(){
		defaultMethod2 dm2 = new defaultMethod2();	//�ٸ� Ŭ������ ������ �����Ϸ��� �ݵ�� ��üȭ�ؾ���.
		System.out.println(dm2.apple);
		System.out.println(defaultMethod2.banana);
	}
	
	static void test2(){
		defaultMethod2 dm2 = new defaultMethod2();
		System.out.println(dm2.apple);
		System.out.println(defaultMethod2.banana);
	}
}
