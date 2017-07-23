package exam04;

public class ClassExam {
	int num;
	String str;
	
	ClassExam(){
		System.out.println("기본 생성자 호출");		
	}//생성자
	
	ClassExam(String str){//overloading
		System.out.println("스트링 파라메터 생성자 호출");
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
		ClassExam ce = new ClassExam(""); //생성자 실행법은 최초에 생성할때만 호출 가능
		//ce.ClassExam(); 이런건 불가능함! 최초에 변수 만들때만 가능!
		
		String str = "asdf";
		ce.printStr(str);
		
		//ce.printStr(getStr()); 얘는 왜 안되고 밑애는 되는걸까
		ce.printStr(ce.getStr());
		
		//num=getNumber();
		int num = ce.getNumber();
	}
}
