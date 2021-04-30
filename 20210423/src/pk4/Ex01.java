package pk4;
//TV용
public class Ex01 implements Ex08{

	private int volume;
	@Override
	public void turnOn() {
		System.out.println("tv를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("tv를 끕니다.");
	}

	@Override
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
	
}
