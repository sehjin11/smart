package pk4;
//�߻�޼���� ��ӹ��� class���� ����(������) �ȴ�.
//interface�� ��ӹ��� class���� interface�� �߻�޼��带 �����ؾ��Ѵ�.

public class Ex09 implements Ex08{
	
	private int volume; //���� ���� ���� ����

	@Override
	//interface�� trunOn() �߻�޼����� ��ü �޼���
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}

	@Override//interface�� �߻�޼��带 ����
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
	
	public int getVolume() {
		return this.volume;
	}

}
