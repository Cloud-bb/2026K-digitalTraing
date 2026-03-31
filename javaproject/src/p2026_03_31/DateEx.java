package p2026_03_31;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// 날짜, 시간 관련 클래스 : Date, Timestamp 클래스
		// 1. Date : 간단한 날짜 , 시간 처리해주는 클래스
		// 연, 월, 일, 시, 분, 초, 요일로 날짜를 출력
		SimpleDateFormat sd = new SimpleDateFormat("YYYY년 MM월 DD일 a hh:mm:ss E요일");

		Date d = new Date();
		System.out.println(d);
		System.out.println(sd.format(d));
		
		// 2.Timestamp : 정밀한 날짜, 시간을 처리해주는 클래스
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		System.out.println(ts);
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		System.out.println(sd.format(d));
	}
	

}