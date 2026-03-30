package p2026_03_30;
class Car{
	//필드
	int gas;
	
	//생성자
	
	//메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	//return 문 : 메소드를 호출한 곳에 값을 돌려주는 역할을 한다
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다");
			return false ;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다(gas잔량:"+gas+")");
				gas -=1;
			}else {
				System.out.println("멈춥니다(gas잔량:"+gas+")");
				return;
			}
		}
	}
}
public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("지금 출발합니다");
			myCar.run();
		}
		
		
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다");
		}else {
			System.out.println("gas 를 주입하세요");
		}
	}

}
