package P2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import P1.DatabaseConnection;
import P1.ProductBean;
public class CartBean {
	public ArrayList<ProductBean> ali=new ArrayList<ProductBean>();
	//public ProductBean pb=null;
	public  ProductBean retrive(String pcode)
	{
		ProductBean pb = null;
		try
		{
			
			Connection con=DatabaseConnection.getCon();
			PreparedStatement prs=con.prepareStatement("select * from products59 where pcode=?");
			prs.setString(1, pcode);
			ResultSet rst=prs.executeQuery();
			while(rst.next())
			{
				pb=new ProductBean();
				pb.setPcode(rst.getString(1));
				pb.setPname(rst.getString(2));
				pb.setPrice(rst.getFloat(3));
				pb.setQut(rst.getInt(4));
			}
		}
		catch
		(Exception e)
		{
			e.printStackTrace();
		}
		return pb;
	}

}
