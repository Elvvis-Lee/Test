package protectedIndicator.Variables;

public class protectedVariables2 {
	protected String apple="���";				//��������, ��ü����(�ν��Ͻ� ����)		==> Heap ����
	protected String orange="������";		//��������, ��ü����(�ν��Ͻ� ����)		==> Heap ����
	protected static String banana="�ٳ���";		//��������, Ŭ��������(static ����)		==> Method Area ����
	protected static String grape="����";//��������, Ŭ��������(static ����)		==> Method Area ����
	
	public static void main(String[] args){
		//1. ���� Ŭ���� ���� protected���� ȣ��.
		protectedVariables2 pv1 = new protectedVariables2();
		System.out.println(pv1.apple);
		System.out.println(pv1.orange);
		System.out.println(banana);
		System.out.println(grape);
	}
}
