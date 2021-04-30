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
			return true;		//obj가 Ex02로 형변환 될 수 있는지(상속됐는지)
		}
		else {
			System.out.println("다른 클래스로 만들어진 객체입니다.");
			return false;}
	}
	
}
