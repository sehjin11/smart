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
			return true;		//obj가 Ex02로 형변환 될 수 있는지(상속됐는지)
		}
		else {
			System.out.println("다른 클래스로 만들어진 객체입니다.");
			return false;}
	}
	
}
