package kr.co.gsm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.util.Calc2;

@WebServlet("/calc2.do")
public class Calc2Controller extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("n1"));
		int num2 = Integer.parseInt(request.getParameter("n2"));
		char op = request.getParameter("op").charAt(0);
		
		Calc2 c2 = new Calc2();
		float result = c2.calc(num1, num2, op);
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<table>");
		out.println("<tr>");
		out.println("<td>"+ result +"</td>");
		out.println("</tr>"); 
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}

}
