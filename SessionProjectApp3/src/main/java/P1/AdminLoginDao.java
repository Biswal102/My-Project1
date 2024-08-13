package P1;
import java.sql.*;
public class AdminLoginDao {
	public AdminBean ab=null;
	public AdminBean login(String uName,String pW)
	{
		try
		{
		Connection con =DatabaseConnection.getCon();
		PreparedStatement prs=con.prepareStatement("select * from  admintab59 where uname=? and password=?");
		prs.setString(1, uName);
		prs.setString(2, pW);
		ResultSet rst=prs.executeQuery();
		if(rst.next())
		{
			ab = new AdminBean();
			ab.setuName(rst.getString(1));
			ab.setpWord(rst.getString(2));
			ab.setfName(rst.getString(3));
			ab.setlName(rst.getString(4));
			ab.setAddrs(rst.getString(5));
			ab.setmId(rst.getString(6));
			ab.setPhno(rst.getLong(7));
		}
		}
		catch
		(Exception e)
		{
			e.printStackTrace();
		}
		return ab;
	}
	

}
