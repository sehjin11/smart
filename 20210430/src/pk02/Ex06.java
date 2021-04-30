package pk02;

public class Ex06 {

	private String company;
	private String os;
	
	public Ex06(String company, String os) {
		this.company=company;
		this.os=os;
	}
	
	public void setCompany(String company) {
		this.company=company;
	}
	public void setOs(String os) {
		this.os=os;
	}
	
	public String getCompany() {
		return this.company;
	}
	public String getOs() {
		return this.os;
	}
	
	@Override
	public String toString() {
		return company + ","+ os;
	}
	
	@Override
	public boolean equals(Object obj) {
		//obj가 현 클래스를 상속 or 생성한 객체인지 확인할 때 사용
		if(obj instanceof Ex06) {	
			return true;
		}else {
			return false;
		}
	}
	
}
