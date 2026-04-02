package p2026_04_02;

public class WrapperEx4 {

	public static void main(String[] args) {
		//Double 클래스는 기본 생성자를 제공하지 않기 떄문에 기본 생성자로
		//doble 객체를 생성할 수 없다.
//		Double d = new Double(); //에러발생
		
		//1.Double (double value)
		Double d1 = new Double(3.14); //박싱
		Double d11 = 3.14; //자동 박싱 
		
		double n1 = d1.doubleValue(); //언박싱
		double n11 = d11;// 자동 언박싱
		
		//2.Double(String s)
		//1)자료형 변환 : "42.195" ----> 42.195
		Double d2 = new Double("42.195"); //박싱
//		Double d22 = "42.195";  //자동 박싱 안됨 (에러 발생)
		
		double n2 = d2.doubleValue(); //언박싱
		double n22 =d2; //자동언박싱
		
		//2)자료형 변환 : "42.195" ---> 42.195
		double num = Double.parseDouble("42.15");
		System.out.println("num"+num);
		
	}

}
