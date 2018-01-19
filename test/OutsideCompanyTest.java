import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OutsideCompanyTest {
	
	OutsideCompany c1;
	OutsideCompany c2;
	OutsideCompany c3;
	OutsideCompany c4;
	OutsideCompany c5;
	
	@Before
	public void initialize() {
		c1 = new OutsideCompany(1, "login1", "password1", "name1", "mail1", "11-111-11", "adress1", "company1");
		c2 = new OutsideCompany(2, "login1", "password1", "name2", "mail2", "11-111-22", "adress2", "company2");
		c3 = new OutsideCompany(1, "login3", "password3", "name3", "mail3", "11-333-11", "adress3", "company3");
		c4 = new OutsideCompany(4, "login4", "password4", "name3", "mail3", "", "adress3", "company3");
		c5 = new OutsideCompany(4, "", "", "name3", "mail3", "name5", "adress3", "company3");
	}
	
	@Test
	public void checkConstructor() {
		assertEquals(c3.getUserID(), 0);
		assertEquals(c2.getLogin(), null);
		assertEquals(c2.getPassword(), null);
		assertEquals(c4.getPhone(), null);
		assertEquals(c5.getLogin(), null);
		assertEquals(c5.getPassword(), null);
	}
	
	@Test
	public void checkSettersandGetters() {
		//ID
		c1.setuserID(8);
		assertEquals(c1.getUserID(), 8);
		c1.setuserID(4);
		assertEquals(c1.getUserID(), 8);
		
		//Login
		c1.setLogin("log1");
		assertEquals(c1.getLogin(), "log1");
		c1.setLogin("login3");
		assertEquals(c1.getLogin(), "log1");
		c1.setLogin("");
		assertEquals(c1.getLogin(), "log1");
		
		//Password
		c1.setPassword("pass1");
		assertEquals(c1.getPassword(), "pass1");
		c1.setPassword("password4");
		assertEquals(c1.getPassword(), "pass1");
		c1.setPassword("");
		assertEquals(c1.getPassword(), "pass1");
		
		
		//Name
		c1.setName("n1");
		assertEquals(c1.getName(), "n1");
		
		//Mail
		c1.setEmail("e1");
		assertEquals(c1.getEmail(), "e1");
		
		//Phone
		c1.setPhone("1");
		assertEquals(c1.getPhone(), "1");
		c1.setPhone("");
		assertEquals(c1.getPhone(), "1");
		
		//Address
		c1.setAdress("add1");
		assertEquals(c1.getAdress(), "add1");
		
		//Company
		c1.setCompany("com1");
		assertEquals(c1.getCompany(), "com1");
	}

}
