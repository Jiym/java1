package exam04;

public class AccessModifier extends Modifier {

	public static void main(String[] args) {
		AccessModifier e = new AccessModifier();
		e.pubNum=3;
		e.proNum=3;//같은 패키지 안에서 됨/ 다른패키지여도 상속받으면 됨
		e.defNum=4;
	}
}
