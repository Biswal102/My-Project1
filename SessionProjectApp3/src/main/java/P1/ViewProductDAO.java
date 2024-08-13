package P1;
import java.sql.*;
import java.util.*;
public class ViewProductDAO {
	public ArrayList<ProductBean> al=new ArrayList<ProductBean>();
	public  ArrayList<ProductBean> retrive()
	{
		try
		{
			Connection con=DatabaseConnection.getCon();
			PreparedStatement prs=con.prepareStatement("select * from products59");
			ResultSet rst=prs.executeQuery();
			while(rst.next())
			{
				ProductBean pb=new ProductBean();
				pb.setPcode(rst.getString(1));
				pb.setPname(rst.getString(2));
				pb.setPrice(rst.getFloat(3));
				pb.setQut(rst.getInt(4));
				al.add(pb);
			}
		}
		catch
		(Exception e)
		{
			e.printStackTrace();
		}
		return al;
	}

}
