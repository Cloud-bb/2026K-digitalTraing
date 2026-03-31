package p2026_03_31;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//3. Calendar 클래스
		
		//Calendar  는 추상 클래스이기때문에 new 연산자로 직접 객체 생성을 할수 없다
//		Calendar c1 = new Calendar(); 		
		//에러 발생
		Calendar c2 = new GregorianCalendar();// 레퍼런스 형변환 (업캐스팅,자동형변환)
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println(Calendar.YEAR); //상수 :1
		
		int y = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH)+1;
		int d = c.get(Calendar.DATE);
		
		System.out.println(y+"-"+m+"-"+d);
		
		int h1 = c.get(Calendar.HOUR);
		int h2 = c.get(Calendar.HOUR_OF_DAY);
		
		int ap = c.get(Calendar.AM_PM);
		if(ap == 0) {
			System.out.println("오전");
		}else {
			System.out.println("오후");
		}
		
		int mm = c.get(Calendar.MINUTE);
		int s = c.get(Calendar.SECOND);
		System.out.println(h1+":"+mm+":"+s);
		System.out.println(h2+":"+mm+":"+s
				);
	}

}
