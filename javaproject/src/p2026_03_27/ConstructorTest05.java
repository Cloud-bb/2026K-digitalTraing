package p2026_03_27;

class MyDate5{   
  private int year;    
  private int month;    
  private int day;

  //기본 생성자는 객체를 생성할 떄 컴파일러가 자동적으로 만들어주지만, 
  //예외적으로 매개변수를 가진 생성자가 있을 경우에는 더 이상 기본 생성자를 만들어 주지 않는다.
  public MyDate5(){
  }
  
  //생성자의 매개변수명과  필드명이 같으면 매개변수로 값 전달이 되지 않는다. (this활용할 것)
  public MyDate5(int new_year, int new_month, int new_day){
    year=new_year;
    month=new_month;
    day=new_day;
  }  
  public void print(){
    System.out.println(year+ "/" +month+ "/" +day); 
  }
}
public class ConstructorTest05 {     
  public static void main(String[] args) {
    MyDate5 d=new MyDate5();  //기본 생성자 호출
    d.print();

    MyDate5 d2=new MyDate5(2023, 7, 19);
    d2.print();
  }
}      