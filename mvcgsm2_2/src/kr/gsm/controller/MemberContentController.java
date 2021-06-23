package kr.gsm.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.gsm.model.MemberDAO;
import kr.gsm.model.MemberVO;

public class MemberContentController implements Controller {
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. 파라미터 수집
		int num = Integer.parseInt(request.getParameter("num"));
		
		// 2. Model과 연동
		MemberDAO dao = new MemberDAO();
		MemberVO vo = dao.memberContent(num);
		
		// 객체 바인딩
		request.setAttribute("vo", vo);
		
		return "memberContent";	// 뷰의 논리적인 이름			뷰의 논리적 이름   --View Resolver--> 물리적인 주소 경로
		//		member/memberContent.jsp
	}
}
