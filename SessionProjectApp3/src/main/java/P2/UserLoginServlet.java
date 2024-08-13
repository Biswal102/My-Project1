package P2;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/user")
public class UserLoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uname=req.getParameter("ucode");
		String pSw=req.getParameter("pasword");
		UserBean ub= new UserLoginDAO().login(uname, pSw);
		if(ub==null)
		{
			req.setAttribute("msg", "Invalid Login Process.........<br>");
			req.getRequestDispatcher("msg.jsp").forward(req, resp);
		}
		else
		{
		req.setAttribute("ub", ub);
		req.setAttribute("msgs", "Login Successfully..........<br>");
		req.getRequestDispatcher("Login.jsp").forward(req, resp);
//		PrintWriter pr=resp.getWriter();
//		resp.setContentType("text/html");
//		pr.println(ub.getFname());
		}
		
	}
}
