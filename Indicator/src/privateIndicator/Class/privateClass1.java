package privateIndicator.Class;

public class privateClass1 {
	public static void main(String[] args){
		//1. Ŭ�����ȿ� ����� Ŭ����(Inner Ŭ����) ȣ��
		
		privateClass1 pC1 = new privateClass1();
		privateClass1.Inner1 I1 = pC1.new Inner1();
		I1.test1();
		
		Ineer2 I2 = new Ineer2();
		I2.test2();
	}
	
	class Inner1{				//�޸𸮿� �ȿö�ͼ�, �����ְ�, ��üȭ ���������
		void test1(){
			System.out.println("apple");
		}
	}
	
	static class Ineer2{	//�޸𸮿� �ö�������� ��ü�� ������
		void test2(){
			System.out.println("banana");
		}
	}
}
