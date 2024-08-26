package mvc.util;
/*
역할
FrontController인 DispatcherServlet이 화면의 분기방식과 응답페이지 정보를 반환 받을 수 있도록 
 */
public class View {
	private String responseJsp;
	private boolean isFlag;
	//생성자
	public View() {
	}
	public View(String responseJsp, boolean isFlag) {
		this.responseJsp = responseJsp;
		this.isFlag = isFlag;
	}
	//set,get
	public String getResponseJsp() {
		return responseJsp;
	}
	public void setResponseJsp(String responseJsp) {
		this.responseJsp = responseJsp;
	}
	public boolean isFlag() {
		return isFlag;
	}
	public void setFlag(boolean isFlag) {
		this.isFlag = isFlag;
	}
	
	@Override
	public String toString() {
		return "View [responseJsp=" + responseJsp + ", isFlag=" + isFlag + "]";
	}
}
