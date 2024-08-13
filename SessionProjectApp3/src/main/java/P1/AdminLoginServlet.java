package P1;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/admin")
public class AdminLoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uname=req.getParameter("uname");
		String pSw=req.getParameter("pasword");
		AdminBean ab=new AdminLoginDao().login(uname, pSw);
		if(ab==null)
		{
			req.setAttribute("msg", "Invalid login Process.....<br>");
		    req.getRequestDispatcher("msg.jsp").forward(req, resp);
		}
		else
		{
			HttpSession hs=req.getSession();
			hs.setAttribute("abean", ab);
			req.getRequestDispatcher("adminHome.jsp").forward(req, resp);
		}
		
	}

}
