package exam05;
import exam04.Modifier;

public class AccessModifier extends Modifier {
	public static void main(String[] args) {
		Modifier e = new AccessModifier();
		e.pubNum=2;//�� �� ����
		
		AccessModifier a = new AccessModifier();
		a.proNum=4;//������Ű���� �ٸ���Ű������ ��ӹ�����
		//e.defNum=1; //�� �� �� ���� ��Ű���� ���� (���� ����)
	}
}
