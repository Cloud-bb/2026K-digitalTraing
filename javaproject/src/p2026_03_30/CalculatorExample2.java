package p2026_03_30;
//p287
//메소드 오버로딩 (Method Overloading)
//: 한 개의 클래스 안에 동일한 이름을 가진 메소드를 여러 개 정의 하는것. 
// 메소드 오버로딩 조건 : 매개변수의 데이터타입, 갯수 ,순서

class Calculator2{
	//매개변수 갯수 
	//정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	//직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height ;
	}
}
public class CalculatorExample2 {

	public static void main(String[] args) {
		Calculator2 myCalcu = new Calculator2();
		
		double result1 = myCalcu.areaRectangle(10);
		double result2 = myCalcu.areaRectangle(10,20);
		
		System.out.println("정사각형 넓이 ="+ result1);
		System.out.println("직사각형 넓이 ="+ result2);
	}

}
