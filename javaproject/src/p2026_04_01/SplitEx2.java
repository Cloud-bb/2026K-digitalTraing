package p2026_04_01;

public class SplitEx2 {

	public static void main(String[] args) {
		String text = "홍길동&이수홍,박연수,김자바-최명호";
		
		String[] name = text.split("&|,|-");
		
		//기본for문 
		for(int i = 0;i<name.length;i++) {
			System.out.println(name[i]+"\t");
		}
		System.out.println();
		
//		향상for문
		for(String name:names) {
			System.out.println(name);
		}

	}

}
