package P1;
import java.sql.*;
public class DeleteDAO {
	public static int k=0;
	public static int delete(String pcode)
	{
		
		try
		{
			Connection con =DatabaseConnection.getCon();
			PreparedStatement prs=con.prepareStatement("delete from products59 where pcode=? ");
			prs.setString(1, pcode);
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
