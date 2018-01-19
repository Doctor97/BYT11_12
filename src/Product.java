import java.util.ArrayList;
import java.util.Date;

public class Product {
	
	private static ArrayList<Integer> IDs = new ArrayList<>();
	private int productID;
	public String status;
	public float price;
	public Date date;
	
	public Product(int productID, String status,float price, Date date){
		if(!IDs.contains(productID)) {
			this.productID = productID; 
			IDs.add(productID);
		}
		this.status = status;
		if(price >= 0) this.price = price;
		this.date = date;
	}
	
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		if(!IDs.contains(productID)) {
			this.productID = productID;
			IDs.add(productID);
		}
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		if(price >= 0) this.price = price;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}


}
