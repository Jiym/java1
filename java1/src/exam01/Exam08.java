package exam01;

import java.util.Scanner;

public class Exam08 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("시작 숫자를 입력하세요");
		String initStr=scan.nextLine();
		
		System.out.println("종료 숫자를 입력하세요");
		String endStr=scan.nextLine();
		
		int initN=Integer.parseInt(initStr);
		int endN=Integer.parseInt(endStr);
		int num = 0;
		
		for (int i = initN; i <= endN; i++) {
			if ((i % 3 == 0) && (i % 2 == 0)) {
				num += i;
			}
		}
		System.out.println(num);
	}
}
