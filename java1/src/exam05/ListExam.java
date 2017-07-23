package exam05;

import java.util.ArrayList;
import java.util.HashMap;

public class ListExam {

	public static void main(String[] args) {
		ArrayList ar;
		ar = new ArrayList<Integer>();
		
		for(int i=1;i<6;i++) {//0번째 방부터 1 2 3 4 5가 입력됨 // 만약 원하는위치의방에 숫자를 입력하고싶다면?
			ar.add(i);
		}
		for(int i=0;i<5;i++) {
			//System.out.println(al.get(i));
		}

		HashMap<String,String>hm = new HashMap<String,String>(); //해쉬맵은 키값과 벨류값을 지정해야함
		hm.put("0", "1");
		
		ArrayList al = new ArrayList<HashMap>();
		al.add(hm);
		
		System.out.println(al.get(0));
	}
}
