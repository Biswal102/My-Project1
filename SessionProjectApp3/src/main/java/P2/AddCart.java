package P2;
import java.io.*;
import java.util.*;
import P1.ProductBean;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/cart")

public class AddCart extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pcd=req.getParameter("pcode");
		ProductBean p = new CartBean().retrive(pcd);
		HttpSession session = req.getSession();
		@SuppressWarnings("unchecked")
		ArrayList<ProductBean> ad = (ArrayList<ProductBean>) session.getAttribute("alist");
		if(ad==null)
		{
			ad = new ArrayList<ProductBean>();
			ad.add(p);
			session.setAttribute("alist", ad);
		}
		else
		{
			ad.add(p);
			session.setAttribute("alist", ad);
		}
		//System.out.println(ad);
		req.getRequestDispatcher("AddCart.jsp").forward(req, resp);
	}

}
