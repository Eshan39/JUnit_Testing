package JUnit.accountTest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bank.Account;
import bank.CurrentAccount;
import bank.UserInformation;

class depositeMoneyTesting {

	@Test
	void test11() {
			
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		double output = ac.depositMoney(1000.0);
		
		assertEquals(2000.0, output);
		
	}
	
	@Test
	void test() {
			
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		double output = ac.depositMoney(999.0);
		
		assertEquals(1999, output);
		
	}
	
	@Test
	void test2() {
			
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		double output = ac.depositMoney(1000.00000001);
		
		assertEquals(2000.0, output);
		
	}


}
