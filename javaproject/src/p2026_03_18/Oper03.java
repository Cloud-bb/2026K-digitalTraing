package p2026_03_18;

public class Oper03 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		
		System.out.println("result1:" +result1);	//result1 : true
		System.out.println("result2:" +result2);	//result2 : false
		System.out.println("result3:" +result3);	//result3 : true
		
		System.out.println(num1 < num2);	//false
		
		//  문자들의 크기 대소는 10진수 아스키 코드값으로 비교한다.
		char c1 = 'A'; //65
		char c2 = 'B'; //66
		boolean result4 = (c1 <c2);
		System.out.println("result4 :"+ result4); //true
	}

}
