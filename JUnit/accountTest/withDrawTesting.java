package JUnit.accountTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bank.Account;
import bank.CurrentAccount;
import bank.UserInformation;

class withDrawTesting {

	@Test
	void test() {	
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		double output = ac.withdrawMoney(1000.0);
		assertEquals(0.0, output);
	}
	
	@Test
	void test1() {
			
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		double output = ac.withdrawMoney(1000.0);
		
		assertEquals(1.0, output);
		
	}
	@Test
	void test2() {
			
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		double output = ac.withdrawMoney(100000.0);
		
		assertEquals(-90000, output);
		
	}
	
	@Test
	void test3() {
			
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		double output = ac.withdrawMoney(100000.0);
		
		assertEquals(3, output);
		
	}
	@Test
	void test4() {
			
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		double output = ac.withdrawMoney(500.0);
		
		assertEquals(500, output);
		
	}
	
	@Test
	void test5() {
			
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		double output = ac.withdrawMoney(500.0);
		
		assertEquals(2.0, output);
		
	}

}
