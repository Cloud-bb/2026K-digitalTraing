package p2026_03_30;
//클래스 내부에서 메소드 호출 :
// 메소드 안에서 다른 메소드 호출할 때는 객체를 생성하지 않고, 메소들 이름으로 호출한다
class Calculator{
	int plus (int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus (x,y);
		double result = sum/2;
		return result ;
	}
	
	void execute() {
		double result = avg(7,10);
		println("실행결과: "+result);
	}
	void println(String message) {
		System.out.println(message);
	}
}
public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		//main 메소드 안에서 execute()메소드를 호출할때는 execute 메소드를 가지고 있는 클래스로 객체를 생성한다음에 호출해야된다.
		myCalc.execute();
	}

}
 

//생각을해보자. 9 to 6면 9시간인데 점심ㅅ시간 빼면 8시간.
//마지막한교시 빼면 7시간
//9시부터 1시까지 4시간
//2시부터 5시까지 3시간

