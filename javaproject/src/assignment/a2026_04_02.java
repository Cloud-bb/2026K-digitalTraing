package assignment;

import java.text.DecimalFormat;

public class a2026_04_02 {

	public static void main(String[] args) {
		//반지름(r)이 5인 경우에 다음을 구하는 프로그램을 작성하시오
		//단, 결과는 소수점 2째자리까지 결과가 나타나도록 해야함
		//DecimalFormat 클래스를 활용 
		//%.2f
		
		int r = 5;
		DecimalFormat format = new DecimalFormat("0.00");
		//1) 원주
		double circle = 2*Math.PI*r;
		System.out.println("원주: "+format.format(circle));
		//2) 원의 면적
		double circle2 = Math.PI*r*r;
		System.out.println("원의 면적"+format.format(circle2));
		//3) 표면적
		double circle3 = 4*circle2;
		System.out.println("구의 표면적"+format.format(circle3));
		//4) 부피
		double circle4 = circle3/3*r;
		System.out.println("구의 부피"+format.format(circle4));
	}

}
