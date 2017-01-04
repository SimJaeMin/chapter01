package chapter01;
import java.util.Scanner;

public class IOTest {
	public static void main(String args[]){
		System.out.println("Hello World");
		System.out.print("Hello World\n");
		System.out.print("Hello World");
		
		//줄만 바꿀 때
		System.out.println("");
		System.out.print('\n');
		System.out.println("Hello World");
		Scanner ss= new Scanner(System.in);
		int count = ss.nextInt();
		int count2 = ss.nextInt();
		String str =ss.next();
		String str2 = ss.nextLine();
		System.out.println(str+":"+str2);
		//스캐너 자원정리, 스캐너같은 외부 입출력 장치를 사용하면 닫아줘야한다.
		ss.close();
	}

}
