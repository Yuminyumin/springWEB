package mvc.user.ctrl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mvc.user.domain.UserRequestDTO;
import mvc.user.domain.UserResponseDTO;
import mvc.user.service.UserService;
import mvc.util.Controller;
import mvc.util.View;

public class LoginController implements Controller{
	
	private UserService service;
	public LoginController() {
		service = new UserService();
	}
	/*
	Controller 역할
	1. 파라미터가 있으면 값을 전달받고 이걸 DTO에 바인딩
	2. DTO 객체를 service에 전달하여 특정 결과를 반환
	3. 전달받은 값을 jsp에 출력한다면 데이터 심어(session, request)
	4. View 객체를 이용해서 분기방식과 렌더링 될 페이지 정보를 DispatcherServlet 에 전달
	 */
	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("debug >>> LoginController execute");
		
		String id  = request.getParameter("id");
		String pwd = request.getParameter("id");
		
		UserRequestDTO requestUser = new UserRequestDTO();
		requestUser.setId(id);
		requestUser.setPwd(pwd);
		
		UserResponseDTO responseUser = service.login(requestUser);
		View view = new View();
		
		if(responseUser != null) {
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", responseUser);
			
			//request.setAttribute("loginUser", responseUser);
			
			view.setFlag(true);
			view.setResponseJsp("./main.jsp");
		} else {
			view.setFlag(true);
			view.setResponseJsp("./error.jsp");
		}
		
		return view;
	}
	
}
