package JUnit.savingsAccountTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bank.Account;
import bank.CurrentAccount;
import bank.SavingsAccount;
import bank.UserInformation;

class depositeMoneyTesting {

	@Test
	void test11() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		SavingsAccount ac= new SavingsAccount(info);
		double output = ac.depositMoney(1000.0);
		
		assertEquals(1500.0, output);
	}
	
	@Test
	void test() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		SavingsAccount ac= new SavingsAccount(info);
		double output = ac.depositMoney(999);
		
		assertEquals(1499.0, output);
	}
	
	@Test
	void test2() {
			
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		SavingsAccount ac= new SavingsAccount(info);
		double output = ac.depositMoney(999.000000009);
		
		assertEquals(1499.0000001, output);
		
	}


}
