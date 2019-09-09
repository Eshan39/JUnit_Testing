package JUnit.database;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bank.Account;
import bank.CurrentAccount;
import bank.Database;
import bank.SavingsAccount;
import bank.UserInformation;

class uniqueAccountTesting {

	@Test
	void test3() {
		
	
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		
		Database db = new Database();
		boolean output= db.isAccountNumberUnique("9637");
		
		
		assertEquals(true,output);
	}
	
	@Test
	void test4() {
		
	
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		
		Database db = new Database();
		boolean output= db.isAccountNumberUnique("9637");
		
		
		assertEquals(false,output);
	}
	
	
	@Test
	void test() {
		
	
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new SavingsAccount(info);
		
		Database db = new Database();
		boolean output= db.isAccountNumberUnique("964756");
		
		
		assertEquals(true,output);
	}
	
	@Test
	void test1() {
		
	
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new SavingsAccount(info);
		
		Database db = new Database();
		boolean output= db.isAccountNumberUnique("964776");
		
		
		assertEquals(false,output);
	}
	
	
}
