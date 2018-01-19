import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class CentralOfficeManageTest {
	
	CentralOfficeManager m1;
	
	@Before
	public void initialize() {
		m1 = new CentralOfficeManager(1, "log1", "", "name1", "sur1", new Date(1516297772816L), "mail", "1-1-1", "inf1", 110.50f, 40);
	}
	
	@Test
	public void checkConstructor() {
		assertEquals(m1.getPassword(), null);
	}
	
	//This class does't have getters and setters. User getters and setters checked in other classes  

}
