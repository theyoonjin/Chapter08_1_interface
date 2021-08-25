package ch08_1_interface;

class PerformanceTest {
	// �ʵ��� ������
	RemoteControl rc = new Television("LG");
	
	public PerformanceTest(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	// �޼ҵ�
	void audioTest() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	// �Ű������� ������
	void controlTest(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
public class PerformanceTestExample {

}
	