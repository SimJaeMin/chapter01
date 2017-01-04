package chapter01;

public class SwithchTest {
	public static void main(String[] args){
		int month= 10;
		int days=0;
		if(month ==1){
			days=31;
		} else if(month==2){
			days=28;
		} else if(month==3){
			days=31;
		} else if(month==4){
			days=30;
		} else if(month==5){
			days=31;
		} else if(month==6){
			days=30;
		}else if(month==7){
			days=31;
		}else if(month==8){
			days=30;
		}else if(month==9){
			days=31;
		}else if(month==10){
			days=30;
		}else if(month==11){
			days=31;
		}else if(month==12){
			days=30;
		}else
			System.out.println("오류");
		System.out.println(month + "월은"+days+"일까지있습니다.");
		
		//스위치문
		switch(month){
		case 1: {
			days=31; break;
		}
		case 2: {days=28; break;
		}
		case 3: {days=31;break;
		}
		case 4: {days=30;break;
		}
		case 5: {days=31;break;
		}
		case 6: {days=30;break;
		}
		case 7: {days=31;break;
		}
		case 8: {days=31;break;
		}
		case 9: {days=30;break;
		}
		case 10: {days=31;break;
		}
		case 11: {days=30;break;
		}
		case 12: {days=31;break;
		}
		default:{System.out.println("오류");
		}
		}
		System.out.println(month+"월은"+days+"일까지있습니다.");
}}
