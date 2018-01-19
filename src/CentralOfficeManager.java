import java.util.Date;

public class CentralOfficeManager extends User{
	
	public CentralOfficeManager(int userID, String loginName, String password, String name, String surname, 
			Date birthDarte,String eMail, String phoneNumber, String creditCardInfo,
			float salary, int workingHours) {
		super(userID, loginName, password, name, surname, birthDarte, eMail, phoneNumber,creditCardInfo);
	}
	
	public boolean fireEmployee(Employee e) {return false;}
	public boolean hireEmployee() {return false;}
	
	public boolean deleteProduct(Product p) {return false;}
	public boolean addProduct() {return false;}
	
	public String checkEmployeeStatus(Employee e) {return "";}
	public String checkProductStats(Product p) {return "";}

}
