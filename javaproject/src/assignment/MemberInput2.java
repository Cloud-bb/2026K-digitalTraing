package assignment;

import java.util.Scanner;

class MemberInfo2 {
	private String name;
	private int age;
	private String email;
	private String address;

	public MemberInfo2(String name, int age, String email, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	};

	public void print() {
		System.out.println("이름>" + name);
		System.out.println("나이>" + age);
		System.out.println("이메일>" + email);
		System.out.println("주소>" + address);
	}
}

public class MemberInput2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("회원이 몇명입니까?");
		int memberNum = Integer.parseInt(sc.nextLine());
		
		MemberInfo2[] arr = new MemberInfo2[memberNum];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println((i+1)+"번 째 회원 정보 입력");
			
			System.out.print("이름>");
			String name = sc.nextLine();
			System.out.print("나이>");
			int age = Integer.parseInt(sc.nextLine());
			System.out.println("email>");
			String email = sc.nextLine();
			System.out.print("주소>");
			String address = sc.nextLine();
			arr [i]= new MemberInfo2(name, age, email, address);
		}
		
			System.out.println("=======회원정보=======");
			for(int i =0;i<arr.length;i++) {
				System.out.println((i+1)+"번째 회원정보");
				arr[i].print();
				System.out.println("==================");
			}
		
	}

}
