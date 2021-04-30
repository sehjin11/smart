package pk4;

public class Ex10 implements Ex08{

	private int volume;
	@Override
	public void turnOn() {
		System.out.println("TV¸¦ ÄÕ´Ï´Ù.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV¸¦ ²ü´Ï´Ù.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>Ex08.MAX_VOLUME) {
			this.volume=Ex08.MAX_VOLUME;
		}
		else if(volume < Ex08.MIN_VOLUME) {
			this.volume=Ex08.MIN_VOLUME;
		}
		else {//0~10»çÀÌÀÇ °ª
			this.volume=volume;
		}
		System.out.println("ÇöÀç º¼·ý : "+this.volume);
	}
	public int getVolume() {
		return this.volume;
	}

}
