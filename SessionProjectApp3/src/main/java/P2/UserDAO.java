package P2;
import java.sql.*;
import P1.DatabaseConnection;
public class UserDAO {
	public int k=0;
	public int insert(UserBean ub)
	{
		try
		{
			Connection con=DatabaseConnection.getCon();
			PreparedStatement prs=con.prepareStatement("insert into user59 values(?,?,?,?,?,?)");
			prs.setString(1, ub.getUcode());
			prs.setString(2, ub.getFname());
			prs.setString(3, ub.getLname());
			prs.setString(4, ub.getGmail());
			prs.setLong(5, ub.getPhno());
			prs.setString(6, ub.getPasword());
			k=prs.executeUpdate();
		}
		catch
		(Exception e)
		{
			e.printStackTrace();
		}
		return k;
	}

}
