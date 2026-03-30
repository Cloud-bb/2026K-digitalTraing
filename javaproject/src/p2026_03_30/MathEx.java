package p2026_03_30;

public class MathEx {

	public static void main(String[] args) {
		//Math 클래스
		//Math 클래스 = 정적 필드 + 정적 메소드
		
		//Math 클래스는 생성자가 제공되지 않기 때문에 , Math 클래스로 직접 객체를 생성할 수 없다.
//		Math m = new Math();
		
		System.out.println("E="+Math.E);
		System.out.println("E="+Math.PI);
		System.out.println("abs()="+Math.abs(-333.545));
		System.out.println("ceil()="+Math.ceil(20.9));// 정수로
		System.out.println("round()="+Math.round(10.5));//반올림 11.0
		System.out.println("floor()="+Math.floor(10.9));//내림 10.0
		System.out.println("ceil()="+Math.max(10, 20));//최대값 20
		System.out.println("ceil()="+Math.min(10, 20));//최소값 10
		System.out.println("ceil()="+Math.pow(2, 3)); //2의 3승 8.0
		
		//0.0 <= Math.random()<1.0
		System.out.println("random()="+Math.random());//난수발생
		
		//주사위 번호
		int num = (int)(Math.random() *6 )+1;
		System.out.println("random()="+num);
		
		//로또 번호 : 1~45
		int lot = (int)(Math.random() *45 )+1;
		System.out.println("random()="+lot);
		
		for(int i = 0;i<=6;i++) {
			System.out.print((int)(Math.random()*45)+1+"\t");
		}
		
		System.out.println("sqrt()="+Math.sqrt(5));//제곱근
	}

}
