package P2;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import P1.*;
import java.util.*;

import P1.ProductBean;
@SuppressWarnings("serial")
@WebServlet("/delet")
public class DeleteCart extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String pcode=req.getParameter("pcode");
		ProductBean p = new CartBean().retrive(pcode);
		HttpSession session = req.getSession();
		ArrayList<ProductBean> ad = (ArrayList<ProductBean>)session.getAttribute("alist");
		req.getRequestDispatcher("AddCart.jsp").forward(req, resp);
		
	}
		
	
  
}

