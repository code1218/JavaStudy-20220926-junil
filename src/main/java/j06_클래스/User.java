package j06_클래스;

public class User {

	/*
	 * 변수
	 * userId
	 * userPassword
	 * userName
	 * userEmail
	 * userPhone
	 * userAddress
	 * 
	 * 매개변수x
	 * 생성자
	 * 
	 * 모든 매개변수
	 * 생성자
	 * 
	 * showUserInfo()
	 * 아이디: 
	 * 비밀번호:
	 * 이름:
	 * 이메일:
	 * 연락처:
	 * 주소:
	 * 
	 * 
	 * 3명
	 * 
	 * 
	 */
	
	String userId;
	String userPassword;
	String userName;
	String userEmail;
	String userPhone;
	String userAddress;
	
	User() {
		
	}

	User(String userId, String userPassword, String userName, String userEmail, String userPhone,
			String userAddress) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.userAddress = userAddress;
	}
	
	void showUserInfo() {
		System.out.println("아이디: " 	+ userId);
		System.out.println("비밀번호: " 	+ userPassword);
		System.out.println("이름: " 		+ userName);
		System.out.println("이메일: " 	+ userEmail);
		System.out.println("연락처: " 	+ userPhone);
		System.out.println("주소: " 		+ userAddress);
	}
	
	
	
	
	
	
	
	
	
	
}



