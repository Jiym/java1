package exam04;

public class ClassExam {
	int num;
	String str;
	
	ClassExam(){
		System.out.println("�⺻ ������ ȣ��");		
	}//������
	
	ClassExam(String str){//overloading
		System.out.println("��Ʈ�� �Ķ���� ������ ȣ��");
	}
	
	public void printStr(String str) {
		System.out.println(getStr());
	}
	
	public String getStr() {
		String str="asdf";
		return str;
	}
	
	public int getNumber() {
		return 3;
	}
	
	public static void main(String[] args) {
		ClassExam ce = new ClassExam(""); //������ ������� ���ʿ� �����Ҷ��� ȣ�� ����
		//ce.ClassExam(); �̷��� �Ұ�����! ���ʿ� ���� ���鶧�� ����!
		
		String str = "asdf";
		ce.printStr(str);
		
		//ce.printStr(getStr()); ��� �� �ȵǰ� �ؾִ� �Ǵ°ɱ�
		ce.printStr(ce.getStr());
		
		//num=getNumber();
		int num = ce.getNumber();
	}
}
