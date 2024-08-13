package P1;
import java.sql.*;
public class UpdateDAO {
	public int k=0;
	public int update(ProductBean pb)
	{
		try
		{
		   Connection con=DatabaseConnection.getCon();
		   PreparedStatement prs=con.prepareStatement("update products59 set price=? , quty=? where pcode=?");
		   prs.setFloat(1, pb.getPrice());
		   prs.setInt(2, pb.getQut());
		   prs.setString(3, pb.getPcode());
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
