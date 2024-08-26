package mvc.user.dao;

import mvc.user.domain.UserRequestDTO;
import mvc.user.domain.UserResponseDTO;

public class UserDao {
	
	public UserResponseDTO loginRow(UserRequestDTO params) {
		System.out.println("debug >>. user dao loginRow");
		// 추후에는 DB 연동을 통해서 인증된 사용자 정보를 객체로 만들어서 반환
		// JDBC - ORM(Mybatis)
		UserResponseDTO response = new UserResponseDTO("jslim", "jslim", "임정섭");
		return response;
	}
}
