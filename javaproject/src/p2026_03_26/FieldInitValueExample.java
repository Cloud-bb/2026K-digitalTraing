package p2026_03_26;

class FieldInitValue{
	//필드
	byte byteField;
	short shortField;
	
	int intField;		
	long longField;
	
	boolean booleanField;		//false로 초기화
	char charField;				//공백문자로 초기화
	
	float floatField;			//실수형 필드는 0.0으로 초기화
	double doubleField;
	
	int[] arrField;
	String referenceField;
}

public class FieldInitValueExample {

	public static void main(String[] args) {
		FieldInitValue fiv = new FieldInitValue();
		
		System.out.println("byteField: "+fiv.byteField);
		System.out.println("shortFiled: "+fiv.shortField);
		System.out.println("intFiled: "+fiv.intField);
		System.out.println("longFiled: "+fiv.longField);
		System.out.println("booleanFiled: "+fiv.booleanField);
		System.out.println("charFiled: "+fiv.charField);
		System.out.println("floatFiled: "+fiv.floatField);
		System.out.println("doubleFiled: "+fiv.doubleField);
		System.out.println("arrFiled: "+fiv.arrField);
		System.out.println("referenceFiled: "+fiv.referenceField);
	}

}
