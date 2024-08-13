package P2;
import java.io.IOException;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@WebServlet("/reg")
@SuppressWarnings("serial")
public class UserRegister extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
			UserBean ub=new UserBean();
			ub.setUcode(req.getParameter("ucode"));
			ub.setFname(req.getParameter("fname"));
			ub.setLname(req.getParameter("lname"));
			ub.setGmail(req.getParameter("gmail"));
			ub.setPhno(Long.parseLong(req.getParameter("phno")));
			ub.setPasword(req.getParameter("password"));
			int k=new UserDAO().insert(ub);
			if(k>0)
			{
				req.setAttribute("msgs", "Register successfully......<br>");
				req.getRequestDispatcher("UserRegister.jsp").forward(req, resp);
			}
        }
		
		
	 
	
}
