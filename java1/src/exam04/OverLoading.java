package exam04;

public class OverLoading {
	//OverLoading = �Լ��̸����� �Ķ���Ͱ� �ٸ��� ������ ���� ����
	//OverWriting = ����� �����Լ��� �ٸ�Ŭ�������� ���� �Լ� �ۼ� ����
	public void over(int a, String b) {
		System.out.println("over�Լ��� ȣ���߽��ϴ�");
	}
	
	public void over(String b, int a) {
		System.out.println("over�Լ��� ȣ���߽��ϴ�");
	}
	
	public String over(String str) {
		System.out.println("over�Լ��� ȣ���߽��ϴ�");
		return "str";
	}
	
}
