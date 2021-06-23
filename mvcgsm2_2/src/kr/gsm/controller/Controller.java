package kr.gsm.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
	
	public String requestHandler(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException;
}

//    POJO의 메서드 이름을 requestHandler로 통일
// -> 모든 POJO는 requestHandler를 가지고 requestHandler를 실행 시키면됨
// -> requestHandler를 포함시키게 interface로 만들고 POJO에 상속시킴