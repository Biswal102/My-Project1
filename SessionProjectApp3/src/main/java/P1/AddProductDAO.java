package P1;
import java.sql.*;
public class AddProductDAO {
	public int k=0;
	public int insert(ProductBean pb)
	{
		try
		{
			Connection conn=DatabaseConnection.getCon();
			PreparedStatement prs=conn.prepareStatement("insert into products59 values(?,?,?,?)");
			prs.setString(1, pb.getPcode());
			prs.setString(2, pb.getPname());
			prs.setFloat(3, pb.getPrice());
			prs.setInt(4, pb.getQut());
			k=prs.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return k;
	}

}
