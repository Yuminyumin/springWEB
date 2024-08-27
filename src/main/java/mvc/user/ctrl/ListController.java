package mvc.user.ctrl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.user.domain.UserResponseDTO;
import mvc.util.Controller;
import mvc.util.View;

public class ListController implements Controller{

	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("debug >>> ListController execute");
		
		// 구현
		List<UserResponseDTO> list = new ArrayList<UserResponseDTO>();
		list.add(new UserResponseDTO("jslim", "jslim", "임정섭"));
		list.add(new UserResponseDTO("jslim", "jslim", "임정섭"));
		list.add(new UserResponseDTO("jslim", "jslim", "임정섭"));
		
		request.setAttribute("lst", list);
		
		View view = new View();
		view.setResponseJsp("list.jsp");
		view.setFlag(true);
		
		return view;
	}

}
