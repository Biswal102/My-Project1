package P2;
import java.io.*;
import java.util.*;
import P1.ProductBean;
import P1.ViewProductDAO;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/ViewProducts")
public class UserViewAllProductsServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ArrayList<ProductBean> al=new ViewProductDAO().retrive();
		req.setAttribute("alist", al);
		req.getRequestDispatcher("ViewProducts.jsp").forward(req, resp);
	}
}
