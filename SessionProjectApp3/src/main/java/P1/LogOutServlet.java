package P1;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/LogOut")
public class LogOutServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession hs=req.getSession(false);
		if(hs==null)
		{
			req.setAttribute("msg", "Session Is Expired......<br>");
		}
		else
		{
			hs.removeAttribute("abean");
			hs.removeAttribute("alist");
			hs.invalidate();
			req.setAttribute("msg", "LogOut Successfully........<br>");
			req.getRequestDispatcher("msg.jsp").forward(req, resp);
		}
	}
}
