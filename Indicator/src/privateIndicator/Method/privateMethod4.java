package privateIndicator.Method;

public class privateMethod4 {
	public static void main(String[] args){
	//4. 외부 클래스의 private 인스턴스 메소드와 private static 메소드 호출. 
		
		Test2 test = new Test2();	// 외부 클래스는 클래스를 객체화시켜서 사용한다.
		test.test3();				
		test.test4();			
	}
}

class Test2{
	void test3(){
		String apple="사과";
		System.out.println(apple);
	}
	
	static void test4(){
		String banana="바나나";
		System.out.println(banana);
	}
}
