package privateIndicator.Method;

public class privateMethod4 {
	public static void main(String[] args){
	//4. �ܺ� Ŭ������ private �ν��Ͻ� �޼ҵ�� private static �޼ҵ� ȣ��. 
		
		Test2 test = new Test2();	// �ܺ� Ŭ������ Ŭ������ ��üȭ���Ѽ� ����Ѵ�.
		test.test3();				
		test.test4();			
	}
}

class Test2{
	void test3(){
		String apple="���";
		System.out.println(apple);
	}
	
	static void test4(){
		String banana="�ٳ���";
		System.out.println(banana);
	}
}
