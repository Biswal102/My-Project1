package P1;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/delete")
public class DeleteSevlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession hs=req.getSession(false);
		if(hs==null)
		{
			req.setAttribute("msg.jsp", "Session is Exparied.....<br>");
			req.getRequestDispatcher("msg.jsp").forward(req, resp);
		}
		else
		{
			//ProductBean pb=new ProductBean();
			String pcode=req.getParameter("pcode");
			DeleteDAO.delete(pcode);
			req.setAttribute("msg", "Product Delete SucessFully.......<br>");
			req.getRequestDispatcher("Delete.jsp").forward(req, resp);
			
		}
	}

}
