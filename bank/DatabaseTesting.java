package bank;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DatabaseTesting {

	@Test
	void test() {
	
		Database db= new Database();
		boolean output= db.isAccountNumberUnique("90197475");
		
		assertEquals(false,output);
	}
	
	@Test
	void test2() {
	
		Database db= new Database();
		Account output= db.getAccount(null);
		
		assertEquals(null,output);
	}
	
	@Test
	void test3() {
		
		boolean expected= true;
	
		Database db= new Database();
		boolean output= db.addNewAccount(null);
		
		assertEquals(true,output);
	}
	
	@Test
	void test4() {
		
		boolean expected= true;
	
		Database db= new Database();
		Account output= db.getAccount("90197475", "9637");
		
		assertEquals(output, true);
	}


}
