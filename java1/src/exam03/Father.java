package exam03;

public class Father {

	int money = 1000;
	String car = "YF소나타";
	String house = "강남타워펠리스";
	String who = "아빠";
	
	public Father() {
		
	}
	
	public void printHouse() {
		System.out.println(house);
	}
	
	public void doJob() {
		System.out.println(who+"일중");
	}
	
	public void doSleep() {
		System.out.println(who+"잔다");
	}
}
