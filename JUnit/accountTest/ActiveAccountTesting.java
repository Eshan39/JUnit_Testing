package JUnit.accountTest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bank.Account;
import bank.CurrentAccount;
import bank.UserInformation;

class ActiveAccountTesting {

	@Test
	void test11() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		boolean output=ac.activateAccount();
		
		System.out.println(output );
		
		assertEquals(true, output);
		
	}
	
	
	
	@Test
	void test12() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		boolean output=ac.activateAccount();
		
		assertEquals(false, output);
		
	}
	
	
}
