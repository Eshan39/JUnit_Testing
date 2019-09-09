package JUnit.accountTest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bank.Account;
import bank.CurrentAccount;
import bank.UserInformation;

class setAccountNoTesting {

	//set accountNo
	
		@Test
		void test16() {
			UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
			Account ac =new CurrentAccount(info);
			String output =  ac.setAccountNo("90197475");	
			assertEquals("90197475", output);	
		}
		
		@Test
		void test17() {
			UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
			Account ac =new CurrentAccount(info);
			String output =  ac.setAccountNo("90197475");	
			assertEquals("901974750", output);
		}
		
		@Test
		void test1() {
			UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
			Account ac =new CurrentAccount(info);
			String output =  ac.setAccountNo("90197475");
			
			assertEquals(901974750, output);
		}
		
		@Test
		void test() {
				
			UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
			Account ac =new CurrentAccount(info);
			String output =  ac.setAccountNo("90197475.00");
			assertEquals("90197475", output);	
		}
		
		
}
