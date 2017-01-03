package chapter01;

public class VariableTest {
	int number;
	public void test(){
		//int j=number+10;//인스턴스 변수는 초기화 안해주어도 사용가능하다. 에러아님
	}
	public static void main(String args[]){
		int i;
		//int i =20;// 에러 변수이름 중복됨, 변수는 식별자라 중복안된다.
		//int j=i;// 에러 지역변수는 반드시 초기화 되어야 한다.
		int j=10;
		boolean isHolyday=false;
		char c ='A'; //문자리터럴
		char c1 = 65; // 값(아스키코드)
		byte b = 10;
		short s = 20;
		int k = 10;
		long l = 123456789;
		float f = 3.14f;
		double d = 3.14;
		System.out.println(j);
		System.out.println(isHolyday);
		System.out.println(b);
		System.out.println(c+":"+c1);
		System.out.println(s);
		System.out.println(k);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(b+"+"+s);
	}
}
