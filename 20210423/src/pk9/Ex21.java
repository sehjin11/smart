package pk9;

public class Ex21 implements Ex20{

	private int volume;
	private int volume2;
	@Override
	public void turnOn() {
		System.out.println("������� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("������� ���ϴ�.");
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
			System.out.println("��������Դϴ�.");
		}
		else {
			System.out.println("������尡 �����Ǿ����ϴ�.");
			this.volume=this.volume2;
		}
	}
	public void getVolume() {
		System.out.println(this.volume);
	}
	public static void print() {
		System.out.println("�ȳ��ϼ��� �����Դϴ�.");
	}
}
