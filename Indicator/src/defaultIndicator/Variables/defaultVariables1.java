package defaultIndicator.Variables;

public class defaultVariables1 {
	String apple="���";				//��������, ��ü����(�ν��Ͻ� ����)		==> Heap ����
	static String banana="�ٳ���";		//��������, Ŭ��������(static ����)	==> Method Area ����
	
	public static void main(String[] args){
		//1. ����Ŭ�������� default ���� ȣ��.
		defaultVariables1 dv1 = new defaultVariables1();
		System.out.println(dv1.apple);
		System.out.println(defaultVariables1.banana);
	}
}