package pk7;



//TV
//2개 이상의 interface를 상속받는 것을 다중상속.
//interface만 다중상속이 가능하다
public class Ex16 implements Ex14, Ex15 {

	private int volume;
	@Override
	public void search(String url) {
		System.out.println(url+"을 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>Ex14.MAX_VOLUME) {
			this.volume=Ex14.MAX_VOLUME;
		}
		else if(volume < Ex14.MIN_VOLUME) {
			this.volume=Ex14.MIN_VOLUME;
		}
		else {//0~10사이의 값
			this.volume=volume;
		}
		System.out.println("현재 볼륨 : "+this.volume);
	}

}
