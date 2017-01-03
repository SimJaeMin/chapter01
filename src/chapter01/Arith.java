package chapter01;

public class Arith {
	public static void main(String[] args){
		int a=7;
		int b=3;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(-a);
		System.out.println(++a);
		System.out.println(--b);
		System.out.println(a++);
		System.out.println(b--);
		System.out.println(a);
		System.out.println(b);
		System.out.println(10/3);//2개의 int 형의 사칙연산 결과는 int
		System.out.println(10./3.);//2개의 double형의 사칙연산 결과는 double
		//int 형과 double형의 사칙연산 결과는 double
		System.out.println(10./3);
		System.out.println((double)10/3);//괄호가 항상 먼저 10을 더블형태로 한후 나누기
		System.out.println((double)(10/3));//10/3을 한 이후에 더블형으로
	}

}
