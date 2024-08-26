package mvc.ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/index.kdt")
public class IndexController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("client request uri, "+ request.getRequestURI());
//		response.sendRedirect("main.jsp");
		
		// request scope에 심은 데이터는 분기되는 페이지까지만 데이터를 공유할 수 있고
		// session scope에 심은 데이터는 컨텍스트에서 사용되는 모든 파일에서 공유가 가능함
		request.setAttribute("introMsg", "저희 사이트를 찾아주셔서 감사합니다.");
		RequestDispatcher view = request.getRequestDispatcher("main.jsp");
		view.forward(request, response);
		}

}
