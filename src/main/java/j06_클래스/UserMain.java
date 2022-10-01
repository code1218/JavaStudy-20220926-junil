package j06_클래스;

public class UserMain {

	public static void main(String[] args) {
		User user1 = new User();
		User user2 = new User(	"junil", 
								"1234", 
								"김준일", 
								"skjil1218@kakao.com", 
								"010-9988-1916",
								"부산 동래구 사직동");
		
		user1.showUserInfo();
		System.out.println();
		user2.showUserInfo();

	}

}
