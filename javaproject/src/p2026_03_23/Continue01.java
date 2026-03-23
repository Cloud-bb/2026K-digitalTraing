package p2026_03_23;

public class Continue01 {

	public static void main(String[] args) {
		
//		continue문
//		1. 반복문 안에서만 사용할 수 있다
//		2. continue 다시 반복문으로 다시 돌아라는 의미를 가지고있다
//		3. continue문이 실행되면, continue문 아랫쪽의 내용들은 실행되지 않는다. 
		for(int i=1; i<=10; i++) {
			
			if(i==5) continue;
			System.out.println("출력:"+i);
		}
	}

}
