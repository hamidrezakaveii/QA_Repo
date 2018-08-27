package test;

import static org.junit.Assert.*;
import main.Calculator;
import main.CalculatorImpl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorImplTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Connexion � la base de donn�es");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Cl�ture de la connexion � la base de donn�es");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Chargement des donn�es de test pour le cas de test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Lib�ration des variables de donn�es de test");
	}

	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAdd() {
		Calculator calc = new CalculatorImpl();
		int a, b, res;
		a = 5;
		b = 5;
		res = a + b;
		assertTrue("a et b positif" + "\n a = " + a + "\n b = " + b
				+ "\n res = " + res, calc.add(a, b) == res);
		a = 0;
		b = 5;
		res = a + b;
		assertTrue("a nul", calc.add(a, b) == res);
		a = 5;
		b = 0;
		res = a + b;
		assertTrue("b nul", calc.add(a, b) == res);
		a = 0;
		b = 0;
		res = a + b;
		assertTrue("a et b nuls", calc.add(a, b) == res);
		a = -5;
		b = 5;
		res = a + b;
		assertTrue("a n�gatif", calc.add(a, b) == res);
		a = 5;
		b = -5;
		res = a + b;
		assertTrue("b n�gatif", calc.add(a, b) == res);
		a = -5;
		b = -5;
		res = a + b;
		assertTrue("a et b n�gatif", calc.add(a, b) == res);

	}

	
	@Test
	public void testSubstract() {
		fail("Not yet implemented");
	}

}
