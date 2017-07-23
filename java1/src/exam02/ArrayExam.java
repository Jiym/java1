package exam02;

public class ArrayExam {
	public static void main(String[] args) {
		int[] arrNum = new int[20];
		for(int i=0;i<arrNum.length;i++) {
			arrNum[i]=i;
		}//0~19입력
		
		for(int i=0;i<arrNum.length;i++) {
			System.out.println(arrNum[i]);;
		}//0~19출력
		
		System.out.println("arrNum배열의 길이는 "+ arrNum.length);
	}
}
