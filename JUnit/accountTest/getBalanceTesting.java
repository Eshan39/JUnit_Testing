package JUnit.accountTest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bank.Account;
import bank.CurrentAccount;
import bank.UserInformation;

class getBalanceTesting {

	//getBalance
	
		@Test
		void test10() {
			UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
			Account ac =new CurrentAccount(info);
			double output =  ac.balance;
			//System.out.println(output);
			assertEquals(100, output);
		}
		
		@Test
		void test11() {
			UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
			Account ac =new CurrentAccount(info);
			double output =  ac.balance;
			assertEquals(1000.0001, output);
		}
		
		@Test
		void test12() {
			UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
			Account ac =new CurrentAccount(info);
			double output =  ac.getBalance();
			assertEquals(999.9999999, output);
		}
		
		@Test
		void test13() {
			UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
			Account ac =new CurrentAccount(info);
			double output =  ac.getBalance();
			
			assertEquals(1000.0, output);
			
		}

}
