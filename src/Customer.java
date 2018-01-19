import java.util.Date;

public class Customer extends User {
	
	public String shoppingInfo;
	
	public Customer(int userID, String loginName, String password, String name, String surname, 
			Date birthDarte,String eMail, String phoneNumber, String creditCardInfo, String shoppingInfo) {
		super(userID, loginName, password, name, surname, 
				birthDarte, eMail, phoneNumber, creditCardInfo);
		this.shoppingInfo = shoppingInfo;
	}
	
	public String getShoppingInfo() {
		return shoppingInfo;
	}
	
	public void setShoppingInfo(String shoppingInfo) {
		this.shoppingInfo = shoppingInfo;
	}
	
	public boolean shopping() {return false;}
	public boolean checkBalance(ShoppingCard c) {return false;}
	public boolean useCard(ShoppingCard c) {return false;}

}
