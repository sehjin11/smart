package pk01;

public class Ex04 {
	String userId;
	
	public void setUserId(String userId) {
		this.userId=userId;
	}
	public String getUserId() {
		return userId;
	}

	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Ex04) {
			Ex04 ex=(Ex04)obj;
			System.out.println(ex.getUserId());
			return true;		//obj�� Ex02�� ����ȯ �� �� �ִ���(��ӵƴ���)
		}
		else {
			System.out.println("�ٸ� Ŭ������ ������� ��ü�Դϴ�.");
			return false;}
	}
	
}
