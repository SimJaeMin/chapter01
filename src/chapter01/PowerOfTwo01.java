package chapter01;
import java.util.Scanner;
public class PowerOfTwo01 {
	public static void main(String args[]){
		Scanner ss= new Scanner(System.in);
		System.out.print("승수를 입력하세요 : ");
		int pow= ss.nextInt();
		int result=1;
		int i=1;
		while(i<=pow){
			result=result*2;
			 i++;
		}
		System.out.println("2의 "+pow+"승은 "+result+" 입니다.");
	}

}
