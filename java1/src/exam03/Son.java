package exam03;

public class Son extends Father{//son이 상속 받다
	
	public Son() {//생성자 , 밑에서 Son 관련 변수 만들때 사용됨 ,작성안할시 자바가 알아서 작성함
		
	}
	
	
	public void printHouse() {//printHouse가 아빠 아들클래스 둘다있어서 overwrite된 상태
		System.out.println("아들집");
	}
	
	public static void main(String[] args) {
		Son s = new Son();
		Father a = new Son();//상속받은애는 상속하는애로 만들수잇음
		System.out.println(s.who);
		s.printHouse();//override되면 우선 나의것 에서부터 찾음
		s.doJob();
		s.who="나";
		s.doSleep();
	}
}
 

//예를들어 학생 이라는 클래스가 대학생 고등학생 중학생 클래스를 상속하고있다면
//학생 변수명 =  new 대학생();
//학생 변수명 =  new 고등학생(); 뭐이런게 다 됨 (이런걸 다형성 이라고 함);