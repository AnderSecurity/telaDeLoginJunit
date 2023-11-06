
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Map;





public class LoginScreenTest {

	private Map< String, String> userDatabase;
@Test	
	public void TestSucessfullogin() {
		LoginScreen loginScreen = new LoginScreen();
		assertTrue(loginScreen.login("john", "password123"));
		

	}


@Test
public void testFailedLogin() {
	LoginScreen loginScreen = new LoginScreen();
	assertFalse(loginScreen.login("john", "wrongpassword"));
}



@Test
public void testAddUser() {
	LoginScreen loginScreen = new LoginScreen();
	loginScreen.addUser("testuser", "testpassword");
	assertTrue(loginScreen.login("testuser", "testpassword"));
}

}
