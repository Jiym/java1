package exam02;

import exam01.Exam01;

public class StringArray2 {

	int num;
	
	public StringArray2() {//�̰� �Լ��� �ƴѰǰ�?
	System.out.println("��? �� �ֺҷ���?");
	}
	
	
	
	
	public void printStr() {
		System.out.println("�Լ� : printStr�� ȣ���ϼ̳׿�");
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		StringArray2 st2 = new StringArray2();//ȣ�⸸ �ص� ����Ǵ°ǰ�?
		
		//st2�� StringArray2��� Ŭ���� ���� �͵鿡 ���� �����ϰ��ϴ� ����(Reference)����?
		//st2.StringArray2(); �̰� �Լ��μ� ȣ���� �Ұ����Ѱ� �ΰ�?
		st2.num=3;
		st2.printStr();
		
		
		//Person p = new Person(); //���� ��Ű�� �������� �ٸ� Ŭ������ �����ִ°��ΰ�?
		//p.name = "������";
		//p.address = "�漮";
		//p.job = "�л�";
		//p.doJob();
		Exam01 e = new Exam01();
	}
}
