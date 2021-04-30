package pk4;
//추상메서드는 상속받은 class에서 구현(재정의) 된다.
//interface를 상속받은 class에서 interface내 추상메서드를 구현해야한다.

public class Ex09 implements Ex08{
	
	private int volume; //현재 볼륨 변수 설정

	@Override
	//interface내 trunOn() 추상메서드의 실체 메서드
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	@Override//interface의 추상메서드를 구현
	public void setVolume(int volume) {
		if(volume>Ex08.MAX_VOLUME) {
			this.volume=Ex08.MAX_VOLUME;
		}else if(volume<Ex08.MIN_VOLUME) {
			this.volume=Ex08.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("현재 volume : "+volume);
	}
	
	public int getVolume() {
		return this.volume;
	}

}
