package defaultIndicator.Variables;

public class defaultVariables3 {
	String apple="���";				//��������, ��ü����(�ν��Ͻ� ����)		==> Heap ����
	static String banana="�ٳ���";		//��������, Ŭ��������(static ����)	==> Method Area ����
	
	public static void main(String[] args){
		//3. �ٸ�Ŭ���� �ȿ��ִ� 'default ����'�� ȣ��
		Test1 test1 = new Test1();
		System.out.println(test1.apple_price);
		System.out.println(Test1.banana_price);
	}
}
class Test1{
	int apple_price=1000;
	static int banana_price=1500;
}


