package kr.co.gsm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

// servlet의 구성
// 1. Servlet상속
// 2. service method 구성 (req, res, 예외)

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.util.Calc;
// JaveEE->Servlet
public class HelloServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) 
									throws ServletException, IOException {
		// 코딩
		// 1~10까지 총합
		Calc c = new Calc();
		int sum = c.hap();
		
		// 요청한 클라이언트로 응답
		PrintWriter out = res.getWriter();  // Stream
		out.println("<html>");
		out.println("<body>");
		out.println(sum);
		out.println("</body>");
		out.println("</html>");
	}

}
