package exam02;

public class StringArray {
	public static void main(String[] args) {
		String[] arrStr = new String[5];
		//arrStr[0]="a";
		//System.out.println(arrStr[0]);
		
		for(int i=0;i<arrStr.length;i++) {
			arrStr[i]=""+(i+1);//숫자 + 문자 = 문자를 이용!
		}
		
		for(int i=0;i<arrStr.length;i++) {
			System.out.println(arrStr[i]);
		}
	}
	
}
