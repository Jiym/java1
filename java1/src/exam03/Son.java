package exam03;

public class Son extends Father{//son�� ��� �޴�
	
	public Son() {//������ , �ؿ��� Son ���� ���� ���鶧 ���� ,�ۼ����ҽ� �ڹٰ� �˾Ƽ� �ۼ���
		
	}
	
	
	public void printHouse() {//printHouse�� �ƺ� �Ƶ�Ŭ���� �Ѵ��־ overwrite�� ����
		System.out.println("�Ƶ���");
	}
	
	public static void main(String[] args) {
		Son s = new Son();
		Father a = new Son();//��ӹ����ִ� ����ϴ¾ַ� ���������
		System.out.println(s.who);
		s.printHouse();//override�Ǹ� �켱 ���ǰ� �������� ã��
		s.doJob();
		s.who="��";
		s.doSleep();
	}
}
 

//������� �л� �̶�� Ŭ������ ���л� ����л� ���л� Ŭ������ ����ϰ��ִٸ�
//�л� ������ =  new ���л�();
//�л� ������ =  new ����л�(); ���̷��� �� �� (�̷��� ������ �̶�� ��);