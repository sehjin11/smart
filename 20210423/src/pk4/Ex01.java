package pk4;
//TV��
public class Ex01 implements Ex08{

	private int volume;
	@Override
	public void turnOn() {
		System.out.println("tv�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("tv�� ���ϴ�.");
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
		System.out.println("���� volume : "+volume);
	}
	
}
