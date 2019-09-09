package JUnit.savingsAccountTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bank.Account;
import bank.CurrentAccount;
import bank.SavingsAccount;
import bank.UserInformation;

class payBillTest {

	@Test
	void test() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		SavingsAccount ac= new SavingsAccount(info);
		boolean output=ac.payBill(501.0);
		assertEquals(false, output);
		
	}
	@Test
	void test1() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		SavingsAccount ac= new SavingsAccount(info);
		boolean output=ac.payBill(501.0);
		assertEquals(true, output);
	}
	@Test
	void test2() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		SavingsAccount ac= new SavingsAccount(info);
		boolean output=ac.payBill(1.00);
		assertEquals(false, output);
	}
	@Test
	void test3() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		SavingsAccount ac= new SavingsAccount(info);
		boolean output=ac.payBill(1.0);
		assertEquals(true, output);
	}
	@Test
	void test4() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		SavingsAccount ac= new SavingsAccount(info);
		boolean output=ac.payBill(499.0);
		assertEquals(false, output);
	}
	@Test
	void test5() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		SavingsAccount ac= new SavingsAccount(info);
		boolean output=ac.payBill(499.0);
		assertEquals(true, output);
	}
	@Test
	void test6() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		SavingsAccount ac= new SavingsAccount(info);
		boolean output=ac.payBill(250.0);
		assertEquals(false, output);
	}
	@Test
	void test7() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		SavingsAccount ac= new SavingsAccount(info);
		boolean output=ac.payBill(250.0);
		assertEquals(true, output);
	}
	@Test
	void test8() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		SavingsAccount ac= new SavingsAccount(info);
		boolean output=ac.payBill(500.0);	
		assertEquals(false, output);
	}
	@Test
	void test9() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);
		SavingsAccount ac= new SavingsAccount(info);
		boolean output=ac.payBill(500.0);	
		assertEquals(true, output);
	}

}
