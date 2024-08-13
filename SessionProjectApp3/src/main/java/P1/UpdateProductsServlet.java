package P1;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateProductsServlet extends HttpServlet {
	@SuppressWarnings({ "unchecked" })
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession hs=req.getSession(false);
		if(hs==null)
		{
			req.setAttribute("msg", "Session Exparied.....<br>");
			req.getRequestDispatcher("msg.jsp").forward(req, resp);
		}
		else
		{
			ProductBean ab=new ProductBean();
			String pcode=req.getParameter("pcode");
			float pr=Float.parseFloat(req.getParameter("price"));
			float price=(float)pr+ab.getPrice();
			int qu=Integer.parseInt(req.getParameter("quty"));
			int quty=(int)qu+ab.getQut();
			ArrayList<ProductBean> pb=(ArrayList<ProductBean>)hs.getAttribute("alist");
			Iterator<ProductBean> it=pb.iterator();
			while(it.hasNext())
			{
				ProductBean bp=(ProductBean)it.next();
				if(pcode.equals(bp.getPcode()))
				{
				      bp.setPrice(price);
				      bp.setQut(quty);
				      int k=new UpdateDAO().update(bp);
				      if(k>0)
				      {
				    	  req.setAttribute("msg", "Product Update Successfully.......");
				      }
				      
				}
			}
			req.getRequestDispatcher("UpdateProduct.jsp").forward(req, resp);
		}
	}
	

}
