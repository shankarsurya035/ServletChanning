

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class First
 */
@WebServlet("/F")
public class First extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String u=request.getParameter("n1");
		String p=request.getParameter("n2");
		if(u.equals("190410203") && p.equals("shakti"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("/after.html");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("/S");
			request.setAttribute("key","invalid user[FAILED TO LOGIN]");
			rd.forward(request, response);
			
		}
	}

}
