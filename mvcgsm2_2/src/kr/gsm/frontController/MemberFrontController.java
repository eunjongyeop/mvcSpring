package kr.gsm.frontController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.gsm.controller.Controller;
import kr.gsm.controller.MemberContentController;
import kr.gsm.controller.MemberDeleteController;
import kr.gsm.controller.MemberInsertController;
import kr.gsm.controller.MemberListController;
import kr.gsm.controller.MemberRegisterController;
import kr.gsm.controller.MemberUpdateController;


@WebServlet("*.do")
public class MemberFrontController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 클라이언트 요청을 파악하기
		String reqUri = request.getRequestURI();			// /m22/*.do
		String ctx = request.getContextPath();				// /m22
		String command = reqUri.substring(ctx.length());	// /*.do
		System.out.println(command); // ?
		
		// 2. 각 요청에 따른 분기 작업 (헨들러 맵핑)
		Controller controller = null;
		String view = null;
		// HandlerMapping
		HandlerMapping mappings = new HandlerMapping();
		controller = mappings.getController(command);
		
		view = controller.requestHandler(request, response);
		if (view!=null) {			
			if (view.indexOf("redirect:") != -1) {
				response.sendRedirect(view.split(":")[1]);
			} else {
				RequestDispatcher rd = request.getRequestDispatcher(ViewResolver.makeView(view));
				rd.forward(request, response);
			}
		}//-----------------------------------------
	}
}
