package JUnit.savingsAccountTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bank.SavingsAccount;
import bank.UserInformation;

class setBalanceTesting {

	@Test
	void test() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);

		SavingsAccount sa= new SavingsAccount(info);
		double output=sa.setBalance(500.00);
		
		assertEquals(500.00, output);
		
	}
	
	
	@Test
	void test2() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);

		SavingsAccount sa= new SavingsAccount(info);
		double output=sa.setBalance(501);
		
		assertEquals(500.00, output);
		
	}
	
	@Test
	void test3() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);

		SavingsAccount sa= new SavingsAccount(info);
		double output=sa.setBalance(499);
		
		assertEquals(500, output);
		
	}
	
	@Test
	void test4() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);

		SavingsAccount sa= new SavingsAccount(info);
		double output=sa.setBalance(0);
		
		assertEquals(500, output);
		
	}
	
	@Test
	void test5() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);

		SavingsAccount sa= new SavingsAccount(info);
		double output=sa.setBalance(1000.0);
		
		assertEquals(500, output);
		
	}


}
