package defaultIndicator.Method;

public class defaultMethod1 {
	String apple="���";				//��������, ��ü����(�ν��Ͻ� ����)		==> Heap ����
	static String banana="�ٳ���";		//��������, Ŭ��������(static ����)	==> Method Area ����
	
	
	public static void main(String[] args){
		// 1. ���� Ŭ���� ���� default �ν��Ͻ� �޼ҵ�� default static �޼ҵ� ȣ��.
		defaultMethod1 dm1 = new defaultMethod1();
		dm1.test1();
		defaultMethod1.test2();
	}
	
	void test1(){
		System.out.println(apple);
		System.out.println(banana);
	}
	
	static void test2(){
		//System.out.println(apple);	=> apple ������ Heap������ ����Ǿ������� test2 �޼ҵ�� Method Area������ �־ ������ ����. ��üȭ�����ָ� ����.
		System.out.println(banana);
	}
}
