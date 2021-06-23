package kr.gsm.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.gsm.model.MemberDAO;
import kr.gsm.model.MemberVO;

// POJO
public class MemberListController implements Controller {
	public String requestHandler(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		MemberDAO dao = new MemberDAO();
		List<MemberVO> list = dao.memberList();
		response.setContentType("text/html; charset=utf-8");
	
		// 객체 바인딩
		request.setAttribute("list", list);
		
		// 객체 바이딩까지 하고 다음 페이지 정보를 준다.
		// 포워딩은 frontController에서 한다.
		return "memberList";		// *** 다음페이지 정보만 리턴 ***
	}
}
