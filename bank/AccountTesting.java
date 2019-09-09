package bank;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

class AccountTesting {

	@Test
	void test() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		String output=ac.generatePIN();
		
		assertTrue(true,output);
		
	}
	
	@Test
	void test2() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		boolean output=ac.isActivated;
		
		assertEquals(false, output);
		
	}
	
	@Test
	void test3() {
		
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		double output=ac.getBalance();
		
		assertEquals(1000.00, output);
		
	}
	
	@Test
	void test4() {
		
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		double output=ac.withdrawMoney(1000.00);
		
		assertEquals(1.0, output);
		
	}
	
	@Test
	void test5() {
		
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		int output=ac.getAccountType();
		
		//System.out.println(output);
		assertEquals(2.0, output);
		
	}
	
	@Test
	void test6() {
		
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		
		String output=ac.getAccuntNo();	
		
		assertTrue(output.matches("97474747"));

		
	}
	
	//Set balance
	
	@Test
	void test7() {
		
		//setBalance
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		
		double output =  ac.setBalance(20000.0);
		
		
		assertEquals(20000.0, output);
		
	}
	
	@Test
	void test8() {
		
		//setBalance
		
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		
		double output =  ac.setBalance(20000.0000011);
		
		
		assertEquals(20000.000001, output);
		
	}
	
	@Test
	void test9() {
		
		//setBalance
		
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		
		double output =  ac.setBalance(100);
		
		assertEquals(100, output);
		
	}
	
	
	//getBalance
	
	@Test
	void test10() {
		
		
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		double output =  ac.getBalance();
		
		assertEquals(100, output);
		
	}
	
	@Test
	void test11() {
		
		
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		double output =  ac.getBalance();
		
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
	
	//get account No
	
	@Test
	void test14() {
		
		
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		String output =  ac.getAccuntNo();
		
		assertTrue(output.matches("90197475"));
		
	}
	
	@Test
	void test15() {
		
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		Account ac =new CurrentAccount(info);
		String output =  ac.getAccuntNo();
		
		
		assertTrue(output.matches("90197475"),"everytime generate a new accountNo randomly");
		
	}
	
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
		
		assertEquals("90197475", output);
		
	}
	
	
	
	
	

}
