package JUnit.accountTest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bank.Account;
import bank.CurrentAccount;
import bank.UserInformation;

class setBalanceTesting {

	
	@Test
	void test7() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		double output =  ac.setBalance(20000.0);
		
		assertEquals(20000.0, output);
	}
	
	@Test
	void test8() {		
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		double output =  ac.setBalance(20000.0000011);
		
		assertEquals(20000.000001, output);	
	}
	
	@Test
	void test9() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		double output =  ac.setBalance(100);
		
		assertEquals(100, output);	
	}
	
	@Test
	void test() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		double output =  ac.setBalance(10000.0);
		
		assertEquals(9999.999999, output);	
	}

}
