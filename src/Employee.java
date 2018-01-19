import java.util.Date;

public class Employee extends User{
	
	public float salary;
	public int workingHours;
	
	public Employee(int userID, String loginName, String password, String name, String surname, 
			Date birthDarte,String eMail, String phoneNumber, String creditCardInfo,
			float salary, int workingHours) {
		super(userID, loginName, password, name, surname, birthDarte, eMail, phoneNumber,creditCardInfo);
		if(salary >= 0) this.salary = salary;
		if(workingHours >= 0) this.workingHours = workingHours;
	}
	
	public float  getSalary() {
		return salary;
	}
	
	public void setSalary(float salary) {
		if(salary >= 0) this.salary = salary;
	}
	
	public int getWorkingHours() {
		return workingHours;
	}
	
	public void setWorkingHours(int workingHours) {
		if(workingHours >= 0) this.workingHours = workingHours;
	}

}
