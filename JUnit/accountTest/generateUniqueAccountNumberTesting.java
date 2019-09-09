package JUnit.accountTest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bank.Account;
import bank.CurrentAccount;
import bank.UserInformation;

class generateUniqueAccountNumberTesting {

	@Test
	void test() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		String output=ac.generateUniqueAccountNumber();
		
		assertTrue(true,output);
		
	}
	
	@Test
	void test1() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		String output=ac.generateUniqueAccountNumber();
		
		assertEquals("90197475", output);
		
	}
	
	
	
	
	@Test
	void test4() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		String output=ac.generateUniqueAccountNumber();
		
		assertEquals("97199457", output);
	
		
	}


}
