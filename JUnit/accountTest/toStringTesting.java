package JUnit.accountTest;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bank.Account;
import bank.CurrentAccount;
import bank.UserInformation;

class toStringTesting {
	
	
	@Test
	void test10() {	
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		String string=ac.toString();
		System.out.println(string);
		
		assertTrue(string.matches(2+"\n"+ 1000.0 + "\n" + null + "\n" + false + "\n"));
	}
	
	@Test
	void test9() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		String string=ac.toString();
		System.out.println(string);
		
		assertTrue(string.matches(2+"\n"+ 500.0 + "\n" + null + "\n" + true + "\n"));
	}

	@Test
	void test2() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		String string=ac.toString();
		System.out.println(string);
		
		assertTrue(string.matches(2+"\n"+ 1000.0 + "\n" + info + "\n" + false + "\n"));	
	}
	
	@Test
	void test1() {	
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		String string=ac.toString();
		System.out.println(string);
		
		assertTrue(string.matches(1+"\n"+ 1000.0 + "\n" + info + "\n" + false + "\n"));	
	}
	
	@Test
	void test5() {	
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		String string=ac.toString();
		assertTrue(string.matches(2+"\n" + 999.0 + "\n" + info + "\n" + true+"\n"));
	}
	
	@Test
	void test4() {	
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		String string=ac.toString();
		
		assertTrue(string.matches(2+"\n" + 999.0 + "\n" + info + "\n" + false+"\n"));
	}
	
	@Test
	void test() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		
		String string=ac.toString();
		assertTrue(string.matches(2+"\n" + 1001.0 + "\n" + info + "\n" + false+"\n"));
	
		
	}


}
