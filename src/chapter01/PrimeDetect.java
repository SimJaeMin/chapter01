package chapter01;
import java.util.Scanner;
public class PrimeDetect {
	public static void main(String args[]){
		Scanner ss = new Scanner(System.in);
		System.out.print("소수인지 판단할 숫자 : ");
		int number = ss.nextInt();
		int i=2;
		//판단 알고리즘
	    while(number%i!=0&&i<number){
	    	i++;
	    }	
		//출력
	    if(i==number)
	    System.out.println(number+ "는 소수이다.");
	    else
	    	System.out.println(number +"는 소수가 아니다.");
	}
	

}
