package pk4;

public class Ex11_test {
	public static void main(String[] args) {
		//�͸� ��ü ���� : interface�θ� ��������
		//�Ϲ� Ŭ������ �߻�Ŭ������ �̿��ؼ� ����� ����
		//�͸� ��ü�� ����� interface�� Ŭ������ ������� �ʰ� �ٷ� ���� �ִ�.
		//��ü ������ �� ������ �ڿ� {};�� �ϸ� �͸� ��ü�� ���� �� �ִ�.
		Ex11 ex=new Ex11() {
			
			private int volume;
			@Override
			public void turnOn() {
				System.out.println("Tv�� �մϴ�.");
			}

			@Override
			public void turnOff() {
				System.out.println("Tv�� ���ϴ�.");
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
			
		};
		ex.turnOn();
		ex.turnOff();
		ex.setVolume(-200);
		
	
	
}
}
