package P1;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/ViewAllProduct")
public class ViewAllProductsServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession hs=req.getSession(false);
		if(hs==null)
		{
			req.setAttribute("msg", "Session is Expired......<br>");
			req.getRequestDispatcher("msg.jsp").forward(req, resp);
		}
		else
		{
			ArrayList<ProductBean> al=new ViewProductDAO().retrive();
			hs.setAttribute("alist", al);
			req.getRequestDispatcher("ViewAllProducts.jsp").forward(req, resp);
		
		}
	}

}
