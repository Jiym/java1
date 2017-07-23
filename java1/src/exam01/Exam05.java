package exam01;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//CTRL SHIFT O
		System.out.println("니가 생각하는 숫자를 읊어보렴~");
		int str = scan.nextInt();


		if(str==1) {
			System.out.println("입력한 수는 1입니다");
		}
		else if(str==2) {
			System.out.println("입력한 수는 2입니다");
		}
		else {
			System.out.println("먼지 모르겟당");
		}
	}
}
