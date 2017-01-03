package chapter01;

public class TypeTest {
	public static void main(String args[]){
       //암시적 (implicity)캐스팅, 값이 안넘치는 경우, 표현할수있는 데이터의 크기가 안넘치는경우
		int i1 = 9999;
		long l1 = i1;
		
		//명시적(explicity) 캐스팅 표현할수있는 데이터의 크기가 넘치는 경우
		long l2 =982389123412312323L;
		int i2 = (int)l2;
		System.out.println(l1+":"+i1);
		System.out.println(l2+":"+i2);
	}
	}


