package P2;
import java.sql.*;
import P1.DatabaseConnection;
public class UserLoginDAO {
	public UserBean ub=null;
	public UserBean login(String uCode, String pSw)
	{
		try
		{
			Connection con =DatabaseConnection.getCon();
			PreparedStatement prs=con.prepareStatement("select * from  user59 where ucode=? and pasword=?");
		    prs.setString(1, uCode);
		    prs.setString(2, pSw);
		    ResultSet rst=prs.executeQuery();
		    if(rst.next())
		    {
		    	ub=new UserBean();
		    	ub.setUcode(rst.getString(1));
		    	ub.setFname(rst.getString(2));
		    	ub.setLname(rst.getString(3));
		    	ub.setGmail(rst.getString(4));
		    	ub.setPhno(rst.getLong(5));
		    	ub.setPasword(rst.getString(6));
		    }
		}
		catch
		(Exception e)
		{
			e.printStackTrace();
		}
		
		return ub;
		
	}

}
