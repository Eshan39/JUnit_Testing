package JUnit.Information;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bank.UserInformation;

class InformationTesting {
	
	@Test
	void test01() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);

		String test= info.toString();
		assertTrue(test.matches("Eshan"+"\n"+"Sarker"+"\n"+"bsse0828@iit.du.ac.bd"+"\n"+ "01790638386"+"\n"+"587056889705"+"\n"+"fh hall"+"\n"+"student"+"\n"+"male"+"\n"+null));
	}
	
	@Test
	void test02() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);

		String test= info.toString();
		assertTrue(test.matches("Eshan"+"\n"+"Mahmud"+"\n"+"bsse0828@iit.du.ac.bd"+"\n"+ "01790638386"+"\n"+"587056889705"+"\n"+"fh hall"+"\n"+"student"+"\n"+"male"+"\n"+null));
	}
	
	@Test
	void test03() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);

		String test= info.toString();
		assertTrue(test.matches("EshanMia"+"\n"+"Sarker"+"\n"+"bsse0828@iit.du.ac.bd"+"\n"+ "01790638386"+"\n"+"587056889705"+"\n"+"SH hall"+"\n"+"student"+"\n"+"male"+"\n"+null));
	}
	
	@Test
	void test04() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", null, "student", "male",null);

		String test= info.toString();
		assertTrue(test.matches("Eshan"+"\n"+"Sarker"+"\n"+"bsse082@iit.du.ac.bd"+"\n"+ "01790638386"+"\n"+"587056889705"+"\n"+null+"\n"+"student"+"\n"+"male"+"\n"+null));
	}
	
	@Test
	void test05() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);

		String test= info.toString();
		assertTrue(test.matches("Eshan"+"\n"+"Sarker"+"\n"+"bsse0828@iit.du.ac.bd"+"\n"+ "0179063838676"+"\n"+"587056889705"+"\n"+"fh hall"+"\n"+"student"+"\n"+"male"+"\n"+null));
	}
	
	@Test
	void test06() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);

		String test= info.toString();
		assertTrue(test.matches("Eshan"+"\n"+"Sarker"+"\n"+"bsse082@iit.du.ac.bd"+"\n"+ "01790638386"+"\n"+"58705"+"\n"+"fh hall"+"\n"+"student"+"\n"+"male"+"\n"+null));
	}
	
	@Test
	void test07() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);

		String test= info.toString();
		assertTrue(test.matches("Eshan"+"\n"+"Sarker"+"\n"+"bsse0828@iit.du.ac.bd"+"\n"+ "01790638386"+"\n"+"587056889705"+"\n"+"fh hall"+"\n"+"employee"+"\n"+"male"+"\n"+null));
	}
	
	@Test
	void test08() {
		UserInformation info= new UserInformation("Eshan", "Sarker", "bsse0828@iit.du.ac.bd", "01790638386","587056889705", "fh hall", "student", "male",null);

		String test= info.toString();
		assertTrue(test.matches("Eshan"+"\n"+"Sarker"+"\n"+"bsse0828@iit.du.ac.bd"+"\n"+ "01790638386"+"\n"+"587056889705"+"\n"+"fh hall"+"\n"+"student"+"\n"+""+null+null));
	}
	
	
	@Test
	void test09() {
		UserInformation info= new UserInformation(null, null, null, null, null, null, null, null, null);
		String test= info.toString();
		assertTrue((test.matches(null)));
	}


}
