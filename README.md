# Atividade - Junit

A atividade solicita que um teste seja realizado em uma tela de login utilizando Junit, documentação e utilização do Javadoc.

Passo 1: Escrever o teste unitário (JUnit) para a tela de login;
Passo 2: Execute o teste unitário;
Passo 3: Implementar a classe LoginScreen;
Passo 4: Execute o teste unitário novamente;
Passo 5: Documentação, exportar o JAVADOC;

![image](https://github.com/AnderSecurity/telaDeLoginJunit/assets/114704633/37b43681-59bc-4ad3-b5b2-6512a2ce1492)

![image](https://github.com/AnderSecurity/telaDeLoginJunit/assets/114704633/6dc67009-7719-4f19-9947-5d3994befa39)

```

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


```
