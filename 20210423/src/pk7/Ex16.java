package pk7;



//TV
//2�� �̻��� interface�� ��ӹ޴� ���� ���߻��.
//interface�� ���߻���� �����ϴ�
public class Ex16 implements Ex14, Ex15 {

	private int volume;
	@Override
	public void search(String url) {
		System.out.println(url+"�� �˻��մϴ�.");
	}

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
		if(volume>Ex14.MAX_VOLUME) {
			this.volume=Ex14.MAX_VOLUME;
		}
		else if(volume < Ex14.MIN_VOLUME) {
			this.volume=Ex14.MIN_VOLUME;
		}
		else {//0~10������ ��
			this.volume=volume;
		}
		System.out.println("���� ���� : "+this.volume);
	}

}
