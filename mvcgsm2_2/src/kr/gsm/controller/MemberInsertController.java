package kr.gsm.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.gsm.model.MemberDAO;
import kr.gsm.model.MemberVO;

public class MemberInsertController implements Controller {
	public String requestHandler(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String cpath = request.getContextPath();
		request.setCharacterEncoding("utf-8"); // 한글깨짐 방지
		// 1. 파라메터수집 (VO, DTO)
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		
		MemberVO vo = new MemberVO();
		vo.setId(id);
		vo.setPass(pass);
		vo.setName(name);
		vo.setAge(age);
		vo.setPhone(phone);
		vo.setEmail(email);
		
		
		// Database 저장  :  MemberDAO
		MemberDAO dao = new MemberDAO();
		int cnt = dao.memberInsert(vo);
		String view = null;
		
		if (cnt>0) {
			// 성공 -> 리스트보기 요청으로...
			view = "redirect:"+cpath+"/memberList.do";
		} 
		
		return  view;
	}
}
