
public class OutsideCompany extends User{
	
	public String adress;
	public String company;
	
	public OutsideCompany(int userID, String loginName, String password, String name, 
			String eMail, String phoneNumber, String adress, String company) {
		super(userID, loginName, password, name, eMail, phoneNumber);
		this.adress = adress;
		this.company = company;
	}
	
	public String getAdress() {
		return adress;
	}
	
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	public boolean checkProductStats(Product p) {return false;}

}
