package exam05;

import java.util.ArrayList;
import java.util.HashMap;

public class DataExam {

	public static void main(String[] args) {
		String data = "������,24,����/";
		data += "�ȹ���,24,��õ/";
		data += "�̵���,25,����/";
		data += "��浿,22,�λ�";
		
		Object o = "asdf";//��----�� Ŭ������ object�� ��ӹ���
		
		
		
		String[] datas = data.split("/");// ������ �������� �迭�� �־���
		//datas[0] = ������,24,����
		//datas[1] = �ȹ���,24,��õ
		
		ArrayList<HashMap> dataList = new ArrayList<HashMap>();

		for (int i = 0; i < datas.length; i++) {//i�� 0,1,2,3���� �̵�
			String[] inDatas = datas[i].split(",");//inDatas[]���� �ܾ�� �� 0=������ 1=24 2=����
			HashMap<String, String> hm = new HashMap<String, String>();
			for (int j = 0; j < inDatas.length; j++) {//inDatas.length�� �� ���� ��� �ܾ��� ���� ���� �� 3��(0,1,2)
				if (j == 0) {
					hm.put("�̸�", inDatas[j]);//�̸��̶�� Ű���� 
				} else if (j == 1) {
					hm.put("����", inDatas[j]);
				} else if (j == 2) {
					hm.put("�ּ�", inDatas[j]);
				}
			}

			dataList.add(hm);
		}
		System.out.println(dataList.get(0));
		for (HashMap hm : dataList) {
			System.out.println("�ּ�"+hm.get("�ּ�"));
			System.out.println("����"+hm.get("����"));
			System.out.println("�̸�"+hm.get("�̸�"));

		}
		/*
		 * for(int i=0;i<dataList.size();i++){
		 * 
		 * 
		 * }
		 */
	}

}
