package P1;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@SuppressWarnings({ "serial", "unused" })
@WebServlet("/add")
public class AddProductServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession hs =req.getSession(false);
		if(hs==null)
		{
			req.setAttribute("msg", "Session Expired.....<br>");
			req.getRequestDispatcher("msg.jsp").forward(req, resp);
		}
		else
		{
			ProductBean pb=new ProductBean();
			pb.setPcode(req.getParameter("pcode"));
			pb.setPname(req.getParameter("pname"));
			pb.setPrice(Float.parseFloat(req.getParameter("price")));
			pb.setQut(Integer.parseInt(req.getParameter("quty")));
			int k=new AddProductDAO().insert(pb);
			if(k>0)
			{
				req.setAttribute("msg", "<br>Product added successfully......<br>");
				req.getRequestDispatcher("AddProduct.jsp").forward(req, resp);
			}
		}
	}

}
