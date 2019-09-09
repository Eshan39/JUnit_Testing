package JUnit.accountTest;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;
import java.time.Month;

import org.junit.jupiter.api.Test;

import bank.Account;
import bank.CurrentAccount;
import bank.UserInformation;

class transferTesting {

	@Test
	void test() {
			
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		
		UserInformation info1= new UserInformation("karim","mia","karimmia@gmail.com","01700000000","99999999","Mohammadpur, Dhaka","Business Man","male",null);
		Account ac2 =new CurrentAccount(info1);
		
		
		boolean output = ac.transferMoney(ac, 500.00);
		
		assertEquals(true, output);

	}
	
	@Test
	void test1() {
			
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		
		UserInformation info1= new UserInformation("karim","mia","karimmia@gmail.com","01700000000","99999999","Mohammadpur, Dhaka","Business Man","male",null);
		Account ac2 =new CurrentAccount(info1);
		
		
		boolean output = ac.transferMoney(ac, 500.00);
		
		assertEquals(false, output);
		
	}
	
	@Test
	void test2() {
			
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		
		UserInformation info1= new UserInformation("karim","mia","karimmia@gmail.com","01700000000","99999999","Mohammadpur, Dhaka","Business Man","male" ,null);
		Account ac2 =new CurrentAccount(info1);
		
		
		boolean output = ac.transferMoney(ac2, 1000.00);
		
		assertEquals(false, output);
		
	}
	
	@Test
	void test3() {
			
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		
		UserInformation info1= new UserInformation("karim","mia","karimmia@gmail.com","01700000000","99999999","Mohammadpur, Dhaka","Business Man","male",null);
		Account ac2 =new CurrentAccount(info1);
		
		
		boolean output = ac.transferMoney(ac2, 1000.00);
		
		assertEquals(false, output);
		
	}
	
	@Test
	void test4() {
			
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		
		UserInformation info1= new UserInformation("karim","mia","karimmia@gmail.com","01700000000","99999999","Mohammadpur, Dhaka","Business Man","male",null);
		Account ac2 =new CurrentAccount(info1);
		
		
		boolean output = ac.transferMoney(ac2, 1500.00);
		
		assertEquals(true, output);
		
	}
	
	
}
