package privateIndicator.Method;

public class privateMethod2 {
	public static void main(String[] args){
	//2. 같은 클래스안의 인스턴스 메소드와 static메소드  호출.
		privateMethod2 pv1 = new privateMethod2();
		pv1.test1();
		privateMethod2.test2();
	}
	
	void test1(){
		String apple="사과";
		System.out.println(apple);
	}
	
	static void test2(){
		String banana="바나나";
		System.out.println(banana);
	}
}