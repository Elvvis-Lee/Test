package defaultIndicator.Variables;

public class defaultVariables4 {
	String apple="���";				//��������, ��ü����(�ν��Ͻ� ����)		==> Heap ����
	static String banana="�ٳ���";		//��������, Ŭ��������(static ����)	==> Method Area ����
	String orange="������";
	static String grape="����";
	
	public static void main(String[] args){
		//4. �ٸ�Ŭ������ �ν��Ͻ��޼ҵ��� 'default����'�� static�޼ҵ��� 'default����' ȣ��  
		Test test = new Test();
		test.test1();
		Test.test2();
	}
}

class Test{
	void test1(){
		defaultVariables4 dv4 = new defaultVariables4();
		System.out.println(dv4.apple);
		System.out.println(defaultVariables4.banana);
	}
	
	static void test2(){
		defaultVariables4 dv4 = new defaultVariables4();
		System.out.println(dv4.orange);
		System.out.println(defaultVariables4.grape);
	}
}

