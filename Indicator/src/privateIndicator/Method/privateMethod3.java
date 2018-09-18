package privateIndicator.Method;

public class privateMethod3 {
	public static void main(String[] args){
	//3. 외부 클래스의 private 인스턴스 메소드와 private static 메소드 호출 
		
//		Test test = new Test();	// 외부 클래스는 클래스를 객체화시켜서 호출하는데,
//		test.test3();			// 접근제어자가 private이므로 호출할 수없다.
//		test.test4();			
	}
}

class Test{
	private void test3(){
		String apple="사과";
		System.out.println(apple);
	}
	
	private static void test4(){
		String banana="바나나";
		System.out.println(banana);
	}
}
