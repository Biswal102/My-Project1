package P1;
import java.sql.*;
public class DatabaseConnection {
	private static Connection con=null;
	private DatabaseConnection() {}
	
	
	static
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(DatabaseInfo.url,DatabaseInfo.user,DatabaseInfo.psw);
		}
		catch
		(Exception e)
		{
			e.printStackTrace();
		}
	
		
	}
	public static  Connection getCon()
	{
		return con;
	}
	
	

}
