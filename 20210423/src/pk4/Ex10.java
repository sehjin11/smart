package pk4;

public class Ex10 implements Ex08{

	private int volume;
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>Ex08.MAX_VOLUME) {
			this.volume=Ex08.MAX_VOLUME;
		}
		else if(volume < Ex08.MIN_VOLUME) {
			this.volume=Ex08.MIN_VOLUME;
		}
		else {//0~10������ ��
			this.volume=volume;
		}
		System.out.println("���� ���� : "+this.volume);
	}
	public int getVolume() {
		return this.volume;
	}

}
