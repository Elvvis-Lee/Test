package defaultIndicator.Variables;

public class defaultVariables2 {
	String apple="���";				//��������, ��ü����(�ν��Ͻ� ����)		==> Heap ����
	static String banana="�ٳ���";		//��������, Ŭ��������(static ����)	==> Method Area ����
	
	public static void main(String[] args){
		
		//2. ���� Ŭ�����ȿ��ִ� �ν��Ͻ��޼ҵ��� 'default����' �� static�޼ҵ��� 'default����' ȣ��
		defaultVariables2 test = new defaultVariables2();
		test.test1();
		defaultVariables2.test2();
	}
	
	void test1(){
		defaultVariables2 dv2 = new defaultVariables2();
		System.out.println(dv2.apple);
		System.out.println(defaultVariables2.banana);
	}
	
	static void test2(){
		defaultVariables2 dv2 = new defaultVariables2();
		System.out.println(dv2.apple);
		System.out.println(defaultVariables2.banana);
	}
}



