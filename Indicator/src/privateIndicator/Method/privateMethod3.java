package privateIndicator.Method;

public class privateMethod3 {
	public static void main(String[] args){
	//3. �ܺ� Ŭ������ private �ν��Ͻ� �޼ҵ�� private static �޼ҵ� ȣ�� 
		
//		Test test = new Test();	// �ܺ� Ŭ������ Ŭ������ ��üȭ���Ѽ� ȣ���ϴµ�,
//		test.test3();			// ���������ڰ� private�̹Ƿ� ȣ���� ������.
//		test.test4();			
	}
}

class Test{
	private void test3(){
		String apple="���";
		System.out.println(apple);
	}
	
	private static void test4(){
		String banana="�ٳ���";
		System.out.println(banana);
	}
}
