package privateIndicator.Variables;

public class privateVariables1 {
	String apple;				//��������, ��ü����(�ν��Ͻ� ����)		==> Heap ����
	private String orange;		//��������, ��ü����(�ν��Ͻ� ����)		==> Heap ����
	static String banana;		//��������, Ŭ��������(static ����)		==> Method Area ����
	private static String grape;//��������, Ŭ��������(static ����)		==> Method Area ����
	
	public static void main(String[] args){
		//1. ���� Ŭ�����ȿ��� private ����ȣ��.  ==> private ������ ���� Ŭ���� ������ ȣ���� �ߵ�.
		privateVariables1 pv = new privateVariables1();	
		System.out.println(pv.apple);				//1.1 �ν��Ͻ� ���� ȣ��
		System.out.println(pv.orange);				//1.1 �ν��Ͻ� ���� ȣ��
		
		System.out.println(privateVariables1.banana);//1.2 static ���� ȣ��
		System.out.println(privateVariables1.grape); //1.2 static ���� ȣ��
	}
}