package JUnit.savingsAccountTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bank.Account;
import bank.CurrentAccount;
import bank.SavingsAccount;
import bank.UserInformation;

class withdrawTesting {

	@Test
	void test() {
			
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		SavingsAccount ac= new SavingsAccount(info);
		double output = ac.withdrawMoney(500.0);
		
		assertEquals(0.0, output);
		
	}
	
	@Test
	void test1() {
			
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		SavingsAccount ac= new SavingsAccount(info);
		double output = ac.withdrawMoney(500.0);
		
		assertEquals(1.0, output);
		
	}
	@Test
	void test2() {
			
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		SavingsAccount ac= new SavingsAccount(info);
		double output = ac.withdrawMoney(50000.0);
		
		assertEquals(-49500, output);
		
	}
	
	@Test
	void test3() {
			
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		SavingsAccount ac= new SavingsAccount(info);
		double output = ac.withdrawMoney(50000.0);
		
		assertEquals(3, output);
		
	}
	@Test
	void test4() {
			
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		SavingsAccount ac= new SavingsAccount(info);
		double output = ac.withdrawMoney(250.0);
		
		assertEquals(250, output);
		
	}
	
	@Test
	void test5() {
			
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		SavingsAccount ac= new SavingsAccount(info);
		double output = ac.withdrawMoney(250.0);
		
		assertEquals(2.0, output);
		
	}

}
