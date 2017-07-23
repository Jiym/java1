package exam02;

import exam01.Exam01;

public class StringArray2 {

	int num;
	
	public StringArray2() {//이건 함수가 아닌건가?
	System.out.println("어? 나 왜불렀어?");
	}
	
	
	
	
	public void printStr() {
		System.out.println("함수 : printStr을 호출하셨네요");
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		StringArray2 st2 = new StringArray2();//호출만 해도 실행되는건가?
		
		//st2는 StringArray2라는 클래스 안의 것들에 접근 가능하게하는 참조(Reference)변수?
		//st2.StringArray2(); 이건 함수로서 호출이 불가능한것 인가?
		st2.num=3;
		st2.printStr();
		
		
		//Person p = new Person(); //같은 패키지 내에서는 다른 클래스를 쓸수있는것인가?
		//p.name = "지영민";
		//p.address = "흑석";
		//p.job = "학생";
		//p.doJob();
		Exam01 e = new Exam01();
	}
}
