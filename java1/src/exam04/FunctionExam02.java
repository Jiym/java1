package exam04;

public class FunctionExam02 {

	public void printStr1(Person p) {
		p.doSleep();
		p.doWork(); //������Ʈ�� ���������õ� �Լ� ���
		p.doWakeUp();
		System.out.println("�Ű������ִ� �Լ�"+p);
	}
	
	public void printStr1(int str) {
		System.out.println("��Ʈ �Ű����� �ִ� �Լ�"+str);
	}

	protected void printStr1() {
		System.out.println("�Ű����� ���� �Լ�");
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
