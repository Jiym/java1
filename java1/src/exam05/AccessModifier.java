package exam05;
import exam04.Modifier;

public class AccessModifier extends Modifier {
	public static void main(String[] args) {
		Modifier e = new AccessModifier();
		e.pubNum=2;//전 부 가능
		
		AccessModifier a = new AccessModifier();
		a.proNum=4;//같은패키지나 다른패키지여두 상속받은애
		//e.defNum=1; //무 조 건 같은 패키지만 가능 (같은 폴더)
	}
}
