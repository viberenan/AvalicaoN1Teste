package questao1test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import questao1.Triangulo;

public class TrianguloTest {

	private Triangulo tr1;
	private Triangulo tr2;
	private Triangulo tr3;
	private Triangulo tr4;
	private Triangulo tr5;
	private Triangulo tr6;

	@Before
	public void Triangulos() {
		tr1 = new Triangulo(2, 2, 2);
		tr2 = new Triangulo(0, 0, 0);
		tr3 = new Triangulo(10, 10, 12);
		tr4 = new Triangulo(10, 14, 8);
		tr5 = new Triangulo(10, 10, -2);
		tr6 = new Triangulo(10, 10, 20);
	}

	@Test
	public void testTrianguloValido() {
		assertTrue(tr4.trianguloValido());
		assertFalse(tr2.trianguloValido());
	}

	@Test
	public void testEquilatero() {
		assertTrue(tr1.equilatero());
		assertFalse(tr4.equilatero());
	}

	@Test
	public void testIsosceles() {
		assertTrue(tr3.isosceles());
		assertFalse(tr5.isosceles());
		assertFalse(tr2.isosceles());
		assertFalse(tr6.isosceles());
	}

	@Test
	public void testEscaleno() {
		assertFalse(tr1.escaleno());
		assertTrue(tr4.escaleno());
	}

}
