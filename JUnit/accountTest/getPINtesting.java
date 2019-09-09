package JUnit.accountTest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bank.Account;
import bank.CurrentAccount;
import bank.UserInformation;

class getPINtesting {

	@Test
	void test1() {
		
		
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		String output =  ac.getPIN();
		
		assertEquals("753487", output);
		
	}
	
	@Test
	void test2() {
		
		
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		String output =  ac.getPIN();
		// getpin always generate new pin
		assertEquals("75348", output);
		
	}
}
