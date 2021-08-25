package ch08_1_interface;

class PerformanceTest {
	// 필드의 다형성
	RemoteControl rc = new Television("LG");
	
	public PerformanceTest(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	// 메소드
	void audioTest() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	// 매개변수의 다형성
	void controlTest(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
public class PerformanceTestExample {

}
	