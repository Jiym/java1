package exam03;

public class ConExam {

	int age=30;
	String name = "ȫ�浿";
	
	public ConExam(int age, String name) {
		this.age=age;
		this.name = name;

		System.out.println(age+" "+name);
		if(age<20) {
			System.out.println("10�� �Դϴ�");
		}
		else if(age<30) {
			System.out.println("20�� �Դϴ�");
		}
		else if(age<40) {
			System.out.println("30�� �Դϴ�");	
		}
		else if(age<50) {
			System.out.println("40�� �Դϴ�");	
		}
		else if(age<60) {
			System.out.println("50�� �Դϴ�");	
		}
		else{
			System.out.println("������ �޾ư�����");	
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		ConExam ce = new ConExam(20,"��浿");
		
		ConExam ce1 = new ConExam(30,"��浿");
		
		ConExam ce2 = new ConExam(70,"�ҸӴ�");
		
		ConExam[] ce3 = new ConExam[3];
		ce3[0] = new ConExam(70,"�ҸӴ�"); 
		
	}

}
