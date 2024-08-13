package P1;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/edit")
public class EditServlet extends HttpServlet{
	@SuppressWarnings({ "unchecked"})
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession hs=req.getSession();
		if(hs==null)
		{
			req.setAttribute("msg.jsp", "Session is Exparied.....<br>");
			req.getRequestDispatcher("msg.jsp").forward(req, resp);
		}
		else
		{
			String pcode=req.getParameter("pcode");
			ArrayList<ProductBean> al=(ArrayList<ProductBean>)hs.getAttribute("alist");
			Iterator<ProductBean> it=al.iterator();
			while(it.hasNext())
			{
				ProductBean pb=(ProductBean)it.next();
				if(pcode.equals(pb.getPcode()))
				{
					req.setAttribute("pbean", pb);
					break;
				}
			}
			req.getRequestDispatcher("EditProducts.jsp").forward(req, resp);
		}
	}

}
