package p2026_03_27;

class MyDate {
	int year;
	int month;
	int day;

	public MyDate() {
		year = 2023;
		month = 4;
		day = 1;

	}

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}
}// MyDate end

public class ConstructorTest04 {
	public static void main(String[] args) {
		MyDate d = new MyDate();
		d.print();

		MyDate d2 = new MyDate(2026, 3, 27);
		d2.print();
	}
}