package privateIndicator.Class;

public class privateClass2 {
	public static void main(String[] args){
		//2. Ŭ�����ȿ� ����� private Ŭ����(Inner Ŭ����) ȣ��
		
		privateClass2 pC1 = new privateClass2();
		privateClass2.Inner1 I1 = pC1.new Inner1();
		I1.test1();
		
		Ineer2 I2 = new Ineer2();
		I2.test2();
	}
	
	private class Inner1{				//�޸𸮿� �ȿö�ͼ�, �����ְ�, ��üȭ ���������
		void test1(){
			System.out.println("orange");
		}
	}
	
	private static class Ineer2{	//�޸𸮿� �ö�������� ��ü�� ������
		void test2(){
			System.out.println("grape");
		}
	}
}
