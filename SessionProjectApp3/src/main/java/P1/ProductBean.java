package P1;
import java.io.*;
@SuppressWarnings("serial")
public class ProductBean implements Serializable
{
	private String pcode,pname;
	private float price;
	private int qut;
	public ProductBean() {}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQut() {
		return qut;
	}
	public void setQut(int qut) {
		this.qut = qut;
	}
	
	@Override
	public String toString() {
		return "ProductBean [pcode=" + pcode + ", pname=" + pname + ", price=" + price + ", qut=" + qut + "]";
	}
	
	
	
	
	
	
		

}
