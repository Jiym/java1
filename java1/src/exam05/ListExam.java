package exam05;

import java.util.ArrayList;
import java.util.HashMap;

public class ListExam {

	public static void main(String[] args) {
		ArrayList ar;
		ar = new ArrayList<Integer>();
		
		for(int i=1;i<6;i++) {//0��° ����� 1 2 3 4 5�� �Էµ� // ���� ���ϴ���ġ�ǹ濡 ���ڸ� �Է��ϰ�ʹٸ�?
			ar.add(i);
		}
		for(int i=0;i<5;i++) {
			//System.out.println(al.get(i));
		}

		HashMap<String,String>hm = new HashMap<String,String>(); //�ؽ����� Ű���� �������� �����ؾ���
		hm.put("0", "1");
		
		ArrayList al = new ArrayList<HashMap>();
		al.add(hm);
		
		System.out.println(al.get(0));
	}
}
