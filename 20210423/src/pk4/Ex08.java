package pk4;
//��� �ҽ����� Ȯ���ڴ� .java�̴�.
//��� �ҽ������� compile�� ����Ʈ �ڵ� ������ Ȯ���ڴ� .class�̴�
public interface Ex08 {
//interface �������
//���
//�߻� �޼���
//default �޼���(��Ű���� ���� ��쿡�� ��� ����)
//���� �޼���
	
	int MAX_VOLUME=10;
	int MIN_VOLUME=0;
	
	void turnOn();//interface������ public abstract ���� ����
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}
		else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
	
	//interface������ �Ϲ� �޼���� ����� �� ����.
}
