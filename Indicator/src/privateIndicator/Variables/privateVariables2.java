package privateIndicator.Variables;

public class privateVariables2 {
	public static void main(String[] args){
		//2. ���� Ŭ������ �ν��Ͻ� �޼ҵ�� static �޼ҵ忡 ����� private ������ main�޼ҵ忡�� ȣ��
		privateVariables2 pv2 = new privateVariables2();
		pv2.test1();                   	//3.1 ���� Ŭ������ �ν��Ͻ� �޼ҵ��� ���� ȣ���� '�ν��Ͻ�����(pv3).�޼ҵ��' �����Ѵ�.
		
		privateVariables2.test2();		//3.2 �ܺ� Ŭ������ static�޼ҵ��� ���� ȣ���� 'Ŭ������.�޼ҵ��' ���� �Ѵ�.
	}
	
	void test1(){						
	//	private String apple="���";		//���������� ���������� ����� �Ұ����ϴ�.
	//	System.out.println(apple);
	}
	
	static void test2(){				//���������� ���������� ����� �Ұ����ϴ�.
	//	private String banana="�ٳ���";
	//	System.out.println(banana);
	}
}
// static�� ���� ���� �� �޼ҵ�� Ŭ������ �޸𸮿� �ö� ��, �ڵ������� ��ü�� �����ϱ� ������,
// ȣ��� ��ü�� �������� �ʾƵ� �ȴ�. 
