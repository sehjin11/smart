package pk4;
//모든 소스파일 확장자는 .java이다.
//모든 소스파일을 compile한 바이트 코드 파일의 확장자는 .class이다
public interface Ex08 {
//interface 구성요소
//상수
//추상 메서드
//default 메서드(패키지가 같은 경우에만 상속 가능)
//정적 메서드
	
	int MAX_VOLUME=10;
	int MIN_VOLUME=0;
	
	void turnOn();//interface에서는 public abstract 생략 가능
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}
		else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
	//interface에서는 일반 메서드는 사용할 수 없다.
}
