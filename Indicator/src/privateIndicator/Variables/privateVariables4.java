package privateIndicator.Variables;

public class privateVariables4 {
	public static void main(String[] args){
		//4. �ܺ� �ν��Ͻ� Ŭ������ �ν��Ͻ� �޼ҵ��� ���� ȣ��� static �޼ҵ��� private ���� ȣ�� - �������� �������� ���������� ����� �Ұ����ϴ�.
		Test1 test = new Test1();		//4.1 �ܺ� Ŭ������ �ν��Ͻ� �޼ҵ��� ���� ȣ���� ��ü ���� ��
		test.test1();				//'�ܺ�Ŭ������.�޼ҵ��' �����Ѵ�.
		
		Test1.test2();				//4.2 �ܺ� Ŭ������ static �޼ҵ��� ����ȣ���� '�ܺ� Ŭ������.�޼ҵ��'�����Ѵ�.
		
	}
}

class Test1{
	void test1(){						//�������� �������� ���������� ����� �Ұ����ϴ�.
//		private String apple="���";
//		System.out.println(apple);
	}

	static void test2(){				//�������� �������� ���������� ����� �Ұ����ϴ�.
//		private String banana="�ٳ���";
//		private System.out.println(banana);
	}
}
