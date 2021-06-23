package kr.gsm.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.gsm.model.MemberDAO;

public class MemberDeleteController implements Controller {
	public String requestHandler(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		int num = Integer.parseInt(request.getParameter("num"));
		String cpath = request.getContextPath();
		MemberDAO dao = new MemberDAO();
		int cnt = dao.memberDelete(num);
		String view = null;
		if (cnt>0) {
			// 성공 -> 리스트보기 요청으로...	
			view = "redirect:"+cpath+"/memberList.do";	// 다음 페이지로 바꾸는 것은 POJO의 권한이 아니기때문에 경로만 넘겨준다.
		} else {
			// 실패
			throw new ServletException("error");
		}
		return view;
	}
}
