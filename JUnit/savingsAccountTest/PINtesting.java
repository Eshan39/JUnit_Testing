package JUnit.savingsAccountTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bank.Account;
import bank.CurrentAccount;
import bank.SavingsAccount;
import bank.UserInformation;

class PINtesting {

	@Test
	void test() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		SavingsAccount ac= new SavingsAccount(info);
		String output=ac.generatePIN();
		
		assertTrue(true,output);
		
	}
	
	@Test
	void test1() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		SavingsAccount ac= new SavingsAccount(info);
		String output=ac.generatePIN();
		
		assertEquals("1111", output);
		
	}
	
	
	@Test
	void test2() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		SavingsAccount ac= new SavingsAccount(info);
		String output=ac.generatePIN();
		
		assertEquals("2222", output);
	
		
	}
	
	@Test
	void test4() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		SavingsAccount ac= new SavingsAccount(info);
		String output=ac.generatePIN();
		
		assertEquals("9637", output);
	
		
	}

}
