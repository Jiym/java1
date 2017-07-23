package exam05;

import java.util.ArrayList;
import java.util.HashMap;

public class DataExam {

	public static void main(String[] args) {
		String data = "지영민,24,서울/";
		data += "안범준,24,인천/";
		data += "이동휘,25,서울/";
		data += "김길동,22,부산";
		
		Object o = "asdf";//모----든 클래스가 object를 상속받음
		
		
		
		String[] datas = data.split("/");// 구분자 기준으로 배열에 넣어줌
		//datas[0] = 지영민,24,서울
		//datas[1] = 안범준,24,인천
		
		ArrayList<HashMap> dataList = new ArrayList<HashMap>();

		for (int i = 0; i < datas.length; i++) {//i는 0,1,2,3까지 이동
			String[] inDatas = datas[i].split(",");//inDatas[]에는 단어별로 들어감 0=지영민 1=24 2=서울
			HashMap<String, String> hm = new HashMap<String, String>();
			for (int j = 0; j < inDatas.length; j++) {//inDatas.length는 한 줄의 모든 단어의 수와 같음 즉 3개(0,1,2)
				if (j == 0) {
					hm.put("이름", inDatas[j]);//이름이라는 키값에 
				} else if (j == 1) {
					hm.put("나이", inDatas[j]);
				} else if (j == 2) {
					hm.put("주소", inDatas[j]);
				}
			}

			dataList.add(hm);
		}
		System.out.println(dataList.get(0));
		for (HashMap hm : dataList) {
			System.out.println("주소"+hm.get("주소"));
			System.out.println("나이"+hm.get("나이"));
			System.out.println("이름"+hm.get("이름"));

		}
		/*
		 * for(int i=0;i<dataList.size();i++){
		 * 
		 * 
		 * }
		 */
	}

}
