package 자바DB연결;

public class 회원가입 {

	public static void main(String[] args) {
		// win 실행
		MemberDAO dao = new MemberDAO();
		dao.insert();
	}

}
