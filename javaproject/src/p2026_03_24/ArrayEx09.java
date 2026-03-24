package p2026_03_24;

import java.util.Arrays;

public class ArrayEx09 {

	public static void main(String[] args) {
		//정렬(sort)		
//					오름차순 정렬		 내림차순 정렬
//		숫자: 		1,2,3...		10,9,8	
//		문자:			사전순정렬( A,B,C,D,E); 사전역순 정렬(z,x,y)
		
		int[] s = {30,20,75,29,80,12};
		
		Arrays.sort(s); //오름차순 정렬
		
//		향상된 For문
		for(int i:s)
			System.out.println(i+"\t");
	}  

}
