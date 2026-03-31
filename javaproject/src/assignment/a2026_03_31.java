package assignment;

import java.util.Calendar;

public class a2026_03_31 {
//Calendr 클래스를 이용해서 오늘 날짜,시간,요일을 출력하는 프로그램을 구하시오
	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();

		int y = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH) + 1;
		int d = c.get(Calendar.DATE);

		int h1 = c.get(Calendar.HOUR);
		int h2 = c.get(Calendar.HOUR_OF_DAY);

		int ap = c.get(Calendar.AM_PM);

		int mm = c.get(Calendar.MINUTE);
		int s = c.get(Calendar.SECOND);
		int w = c.get(Calendar.DAY_OF_WEEK);
		String[] week = { "일", "월", "화", "수", "목", "금", "토" };

		System.out.println(y + "-" + m + "-" + d);
		System.out.println(h1 + ":" + mm + ":" + s + week[w - 1] + "요일");
		System.out.println(h2 + ":" + mm + ":" + s + week[w - 1] + "요일");

	}

}
