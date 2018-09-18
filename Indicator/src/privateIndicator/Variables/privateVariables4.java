package privateIndicator.Variables;

public class privateVariables4 {
	public static void main(String[] args){
		//4. 외부 인스턴스 클래스의 인스턴스 메소드의 변수 호출과 static 메소드의 private 변수 호출 - 지역변수 내에서는 접근제한자 사용이 불가능하다.
		Test1 test = new Test1();		//4.1 외부 클래스의 인스턴스 메소드의 변수 호출은 객체 생성 후
		test.test1();				//'외부클래스명.메소드명' 으로한다.
		
		Test1.test2();				//4.2 외부 클래스의 static 메소드의 변수호출은 '외부 클래스명.메소드명'으로한다.
		
	}
}

class Test1{
	void test1(){						//지역변수 내에서는 접근제한자 사용이 불가능하다.
//		private String apple="사과";
//		System.out.println(apple);
	}

	static void test2(){				//지역변수 내에서는 접근제한자 사용이 불가능하다.
//		private String banana="바나나";
//		private System.out.println(banana);
	}
}
