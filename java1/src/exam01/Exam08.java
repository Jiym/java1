package exam01;

import java.util.Scanner;

public class Exam08 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� ���ڸ� �Է��ϼ���");
		String initStr=scan.nextLine();
		
		System.out.println("���� ���ڸ� �Է��ϼ���");
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
