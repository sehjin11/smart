package pk9;

public interface Ex20 {

	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 모드입니다.");
		}
		else {
			System.out.println("무음 모드를 해제합니다.");
		}
	}
	static void changeBattery() {
		System.out.println("배터리를 교환합니다.");
	}
	
	
}
