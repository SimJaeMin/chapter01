package chapter01;

public class LeapYear {
	public static void main(String args[]) {
		int year = 2000;
		if (year % 4 == 0) { // 4로 나누어지고
			if (year % 100 == 0) {// 100으로 나누어지고.
				if (year % 400 == 0) {
					System.out.println("윤년이 맞습니다.");
				}
			} else {// 100으로 나누어 지지않으면
				System.out.println("윤년이 맞습니다.");
			}
		} else { // 4로나누어지지않으면
			System.out.println("윤년이아닙니다.");
		}
		if (year % 4 != 0) {
			System.out.println("윤년이아닙니다.");
		} else if (year % 100 != 0) {
			System.out.println("윤년입니다");
		} else if (year % 400 == 0) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("윤년이 아닙니다.");
		}
	}
}
