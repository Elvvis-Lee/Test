package privateIndicator.Class;

public class privateClass3 {
	public static void main(String[] args) {
		//3. 클래스 밖에 선언된 클래스 호출.
		//	- main 메소드 밖에 선언된 private class는 호출안되며, 메소드 안에서는 class를 호출할 수 없음.
		//  - main 메소드 밖에 선언된 private class는 호출안되며, class는 private 지시자를 사용할 수 없음.
	}
}

//private class Inner1 { 
//	void test1() {
//		//...
//	}
//}

//static class Ineer2 { 
//	void test2() {
//		...
//	}
//}

//private static class Ineer3{
//	void test3() {
//		...
//	}
//}