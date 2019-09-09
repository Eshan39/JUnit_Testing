package JUnit.savingsAccountTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bank.SavingsAccount;
import bank.UserInformation;

class getAccountTypetest {

	@Test
	void test3() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);

		SavingsAccount sa= new SavingsAccount(info);
		int output=sa.getAccountType();
		
		assertEquals(1, output);
		
	}
	
	@Test
	void test() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);

		SavingsAccount sa= new SavingsAccount(info);
		int output=sa.getAccountType();
		
		assertEquals(2, output);
		
	}
	
}
