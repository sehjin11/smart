package pk9;

public interface Ex20 {

	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ����Դϴ�.");
		}
		else {
			System.out.println("���� ��带 �����մϴ�.");
		}
	}
	static void changeBattery() {
		System.out.println("���͸��� ��ȯ�մϴ�.");
	}
	
	
}
