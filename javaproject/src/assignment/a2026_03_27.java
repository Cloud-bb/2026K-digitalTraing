package assignment;
import java.util.Scanner;

class MemberInfo {
	private String name;
	private int age;
	private String email;
	private String address;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void print() {
		System.out.println("이름|" + name);
		System.out.println("나이|" + age);
		System.out.println("이메일|" + email);
		System.out.println("주소|" + address);
	}

}

public class a2026_03_27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("회원이 몇명입니까?");
		int count = Integer.parseInt(sc.nextLine());

		MemberInfo[] arr = new MemberInfo[count];
		for (int i = 0; i < arr.length; i++) {

			System.out.println((i + 1) + "번 째 회원 정보 입력");
			System.out.print("이름>");
			String name = sc.nextLine();
			System.out.print("나이>");
			int age = Integer.parseInt(sc.nextLine());
			System.out.println("email>");
			String email = sc.nextLine();
			System.out.print("주소>");
			String address = sc.nextLine();
			arr[i]= new MemberInfo();
			arr[i].setName(name);
			arr[i].setAge(age);
			arr[i].setEmail(email);
			arr[i].setAddress(address);
		
		}
		System.out.println("======================회원정보==========================");
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + "번째 회원");
			arr[i].print();
			System.out.println("====================================================");

		}

	}
}
