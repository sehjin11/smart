package pk01;

public class Ex02 {

	String id;
	
	public Ex02(String id) {
		this.id=id;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	
	public String getId() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Ex02) {
			Ex02 ex=(Ex02)obj;
			System.out.println(ex.getId());
			return true;		//obj�� Ex02�� ����ȯ �� �� �ִ���(��ӵƴ���)
		}
		else {
			System.out.println("�ٸ� Ŭ������ ������� ��ü�Դϴ�.");
			return false;}
	}
	
}
