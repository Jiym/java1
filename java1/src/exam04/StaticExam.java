package exam04;

public class StaticExam {

	public static int num;//애초에 저장
	
	public static void printStr(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		StaticExam se = new StaticExam();
		se.num=2;
		System.out.println(se.num);
		StaticExam.num=4;
		
		System.out.println(se.num);
		System.out.println(StaticExam.num);
		
		se.num=2;
		StaticExam se2 = new StaticExam();
		System.out.println(se2.num);
		
	}
}
