package pk02;

public class Ex03 {

	static int idx;
	int idx1;
	String email;
	String name;
	
	public Ex03(String email, String name) {
		idx1=idx;
		idx++;
		this.email=email;
		this.name=name;
	}		//�����Ҷ����� �������� idx�� +1��
	public String getEmail() {
		return this.email;
	}
	public String getName() {
		return this.name;
	}
	public int getIdx() {
		return idx;
	}

	
}
