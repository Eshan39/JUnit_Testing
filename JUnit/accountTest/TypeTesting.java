package JUnit.accountTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bank.Account;
import bank.CurrentAccount;
import bank.SavingsAccount;
import bank.UserInformation;

class TypeTesting {

	@Test
	void test2() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);

		CurrentAccount ac =new CurrentAccount(info);
		int output=ac.getAccountType();
		
		assertEquals(3, output);
		
	}
	
	@Test
	void test3() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);

		CurrentAccount ac =new CurrentAccount(info);
		int output=ac.getAccountType();
		
		assertEquals(1, output);
		
	}
	
	@Test
	void test() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);

		Account ac =new CurrentAccount(info);
		int output=ac.getAccountType();
		
		assertEquals(2, output);
		
	}

}
