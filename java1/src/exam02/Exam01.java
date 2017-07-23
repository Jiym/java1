package exam02;

public class Exam01 {
	int num1=10;
	public void print1() {
		int num1=5;
		System.out.println(num1);
	}
	public void print2() {
		System.out.println(num1);
	}
	
	public int printNum1() {
		return num1;
	}
	
	public String printStr() {
		return num1+"";
	}
	
	public static void main(String[] args) {
		Exam01 e = new Exam01();
		e.num1=20;
		
		int a = e.printNum1();
		String str = e.printStr();
		
		System.out.println(a);
		System.out.println(str);
		
		
	}
}
