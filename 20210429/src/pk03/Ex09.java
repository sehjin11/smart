package pk03;

public class Ex09 {
	
	String userId;
	String userName;
	String userEmail;
	
	public Ex09(String userId, String userEmail, String userName) {
		this.userId=userId;
		this.userEmail=userEmail;
		this.userName=userName;
	}
	
	public String getEmail() {
		return userEmail;
	}
	
	

}

// 임의의 사용자 4명 넣고 키는 userId로 해서 email 출력