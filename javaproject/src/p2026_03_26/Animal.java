package p2026_03_26;

public class Animal {
	// 사용자 정의 클래스 (자료형)

	int age; // 멤버 변수, 필드(field), 메소드 바깥쪽에서 정의되는 변수
				// heap 영역에 저장된다
	
	//생성자:
	//1. 생성자는 클래스명과 동일한 이름으로 만들어진다
	//2. 생성자는 클래스로 객체를 생성할 때 호출된다.
	//3. 생성자는 필드값을 초기화시키는 역할을 한다
	
	
	
	//	매개변수가 없는 생성자를 기본 생성자라고 부른다 
	public Animal() { // 기본생성자 (Default Constructor)
		System.out.println("생성자 호출 성공");
	}

	public static void main(String[] args) {
		
		int a = 10; //지역변수 : stack 영역에 저장된다.
		String str = new String("자바");
		
		Animal	 	a1		 =	 new 		Animal();
		//클래스	 레퍼런스 변수		연산자	   생성자 호출
		
//		System.out.println(age); //에러발생
		
		//Animal 클래스에 있는 age필드는 new 연산자로 객체를 생성할 떄 
//		heap 메모리에 공간을 할당을 받으면서 age=0 으로 초기화가 된다
		System.out.println(a1.age);
		a1.age = 5;
		System.out.println(a1.age);
		
		Animal a2 = new Animal();
		System.out.println(a2.age);
		
		if(a1==a2) {
			System.out.println("주소값이 같다");
		}else {
			System.out.println("주소값이 다르다");
		}
	}

}
