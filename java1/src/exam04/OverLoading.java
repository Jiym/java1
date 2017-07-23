package exam04;

public class OverLoading {
	//OverLoading = 함수이름같고 파라미터가 다른거 여러개 생성 가능
	//OverWriting = 덮어쓰기 같은함수를 다른클래스에서 새로 함수 작성 가능
	public void over(int a, String b) {
		System.out.println("over함수를 호출했습니다");
	}
	
	public void over(String b, int a) {
		System.out.println("over함수를 호출했습니다");
	}
	
	public String over(String str) {
		System.out.println("over함수를 호출했습니다");
		return "str";
	}
	
}
