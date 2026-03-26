package assignment;

import java.util.Scanner;

class MemberInfo {
	private String name;
	private int age;
	private String email;
	private String address;

	public MemberInfo(String n, int a, String e, String add) {
		name = n;
		age = a;
		email = e;
		address = add;
	};

	public void print() {
		System.out.println("회원정보");
		System.out.println("이름>" + name);
		System.out.println("나이>" + age);
		System.out.println("이메일>" + email);
		System.out.println("주소>" + address);
	}
}

public class MemberInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이용할 서비스 선택");
		
		
		
		System.out.println("회원정보를 입력하세요");
		System.out.print("이름>");
		String name = sc.nextLine();
		System.out.print("나이>");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("email>");
		String email = sc.nextLine();
		System.out.print("주소>");
		String address = sc.nextLine();
		MemberInfo m1 = new MemberInfo(name, age, email, address);
		m1.print();
	}

}
