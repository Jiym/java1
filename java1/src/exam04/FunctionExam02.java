package exam04;

public class FunctionExam02 {

	public void printStr1(Person p) {
		p.doSleep();
		p.doWork(); //스투던트의 오버라이팅된 함수 사용
		p.doWakeUp();
		System.out.println("매개변수있는 함수"+p);
	}
	
	public void printStr1(int str) {
		System.out.println("인트 매개변수 있는 함수"+str);
	}

	protected void printStr1() {
		System.out.println("매개변수 없는 함수");
	}
	
	public static void main(String[] args) {
		FunctionExam02 fe = new FunctionExam02();
		Student bm = new Student();
		fe.printStr1(bm);
		
		Person p = new Person();
		fe.printStr1(p);
		
		int a=0;
		fe.printStr1(a);
	}
}
