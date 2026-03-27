package p2026_03_27;

import java.util.Scanner;

class MemberInfo0{
	//필드 : 클래스로 객체를 생성할 때 heap메모리 상에서 값을 저장하는 역할
	private String name;
	private int age;
	private String email;
	private String address;
	
	//생성자:클래스로 객체를 생성할 때 호출되면 필드값을 초기화 시켜주는 역할
	public MemberInfo0(String name, int age, String email, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}
	
	//메소드 : 생성자로 초기화된 필드를 출력하는 역할
	public void print() {
		System.out.println("name:"+ name);
		System.out.println("age:"+ age);
		System.out.println("email:"+ email);
		System.out.println("address:"+ address);
	}
	
}

public class MemberInput0 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성명을 입력 하세요?");
		String name = sc.nextLine();
		System.out.println("나이를 입력 하세요?");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("이메일주소를 입력 하세요?");
		String email = sc.nextLine();
		System.out.println("주소를 입력 하세요?");
		String address = sc.nextLine();
		
		//생성자 호출
		MemberInfo0 m = new MemberInfo0(name, age, email, address);	

		m.print();
	}

}
