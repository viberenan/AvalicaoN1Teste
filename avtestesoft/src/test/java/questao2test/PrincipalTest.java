package questao2test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import questao2.Principal;

public class PrincipalTest {

	SimpleDateFormat dh = new SimpleDateFormat("HH:mm:ss.SSS");

	@Test
	public void testePrincipal() {
		assertNotEquals(dh.format(new Date()), new Principal().getHorario(), 0.1);
	}

}
