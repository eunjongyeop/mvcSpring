package kr.co.gsm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.util.Calc;
@WebServlet("/calc.do")
public class CalcController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) 
												throws ServletException, IOException {
		// 클라이언트로부터 넘어온 폼 파라메터 열기
		int su1 = Integer.parseInt(request.getParameter("su1"));
		int su2 = Integer.parseInt(request.getParameter("su2"));
		// 처리(Model)
		Calc c = new Calc();
		int sum = c.hap(su1, su2);
		// MIME Type : 서버가 클라이언트에게 어떤종류의 데이터를 보내는지 알려주는 것
		response.setContentType("text/html;charset=UTF-8");
		// 출력
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<table border='1'>");
		out.println("<tr>");
		out.println("<td>총합</td>");
		out.println("<td>"+sum+"</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}
}
