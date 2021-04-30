package pk9;

public class Ex21 implements Ex20{

	private int volume;
	private int volume2;
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>Ex20.MAX_VOLUME) {
			this.volume=Ex20.MAX_VOLUME;
			this.volume2=Ex20.MAX_VOLUME;
		}
		else if(volume<Ex20.MIN_VOLUME) {
			this.volume=Ex20.MIN_VOLUME;
			this.volume2=Ex20.MIN_VOLUME;
		}
		else {
			this.volume=volume;
			this.volume2=volume;
		}
		System.out.println(this.volume);
	}
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.volume=0;
			System.out.println("무음모드입니다.");
		}
		else {
			System.out.println("무음모드가 해제되었습니다.");
			this.volume=this.volume2;
		}
	}
	public void getVolume() {
		System.out.println(this.volume);
	}
	public static void print() {
		System.out.println("안녕하세요 쉬리입니다.");
	}
}
