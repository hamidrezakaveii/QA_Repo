package test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import main.Triangle;
import main.InterfaceTriangle;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConvert() {
		InterfaceTriangle tri = new Triangle();
		double a, b, c;
		int res;
		String str;
		String[] ligne;
		
		//Cas de test : a négatif, b positif et c positif
//		a = -5; b = 5; c = 4; res= 3;
//		assertTrue("Cas de test : a négatif.\na = " + a + "\nb = " + b + "\nRésultatsattendus : " + res+ "\nRésultatsobtenus : " + tri.Tritype(a, b, c), tri.Tritype(a, b, c) == res); 
//		
//		a = 5; b = -5; c = 4; res= 3;
//		assertTrue("Cas de test : a négatif.\na = " + a + "\nb = " + b + "\nRésultatsattendus : " + res+ "\nRésultatsobtenus : " + tri.Tritype(a, b, c), tri.Tritype(a, b, c) == res); 
//		
//		a = 5; b = 5; c = -4; res= 3;
//		assertTrue("Cas de test : a négatif.\na = " + a + "\nb = " + b + "\nRésultatsattendus : " + res+ "\nRésultatsobtenus : " + tri.Tritype(a, b, c), tri.Tritype(a, b, c) == res); 
//		
//		a = 5; b = 5; c = 5; res= 2;
//		assertTrue("Cas de test : a négatif.\na = " + a + "\nb = " + b + "\nRésultatsattendus : " + res+ "\nRésultatsobtenus : " + tri.Tritype(a, b, c), tri.Tritype(a, b, c) == res);
//
//		a = 5; b = 5; c = 11; res= 3;
//		assertTrue("Cas de test : a négatif.\na = " + a + "\nb = " + b + "\nRésultatsattendus : " + res+ "\nRésultatsobtenus : " + tri.Tritype(a, b, c), tri.Tritype(a, b, c) == res);
//		
//		a = 100; b = 10; c = 11; res= 3;
//		assertTrue("Cas de test : a négatif.\na = " + a + "\nb = " + b + "\nRésultatsattendus : " + res+ "\nRésultatsobtenus : " + tri.Tritype(a, b, c), tri.Tritype(a, b, c) == res);
//		
//		a = 5; b = 20; c = 5; res= 3;
//		assertTrue("Cas de test : a négatif.\na = " + a + "\nb = " + b + "\nRésultatsattendus : " + res+ "\nRésultatsobtenus : " + tri.Tritype(a, b, c), tri.Tritype(a, b, c) == res);
//		
//		a = 5; b = 5; c = 2; res= 1;
//		assertTrue("Cas de test : a négatif.\na = " + a + "\nb = " + b + "\nRésultatsattendus : " + res+ "\nRésultatsobtenus : " + tri.Tritype(a, b, c), tri.Tritype(a, b, c) == res);
//		
//		a = 2; b = 5; c = 5; res= 1;
//		assertTrue("Cas de test : a négatif.\na = " + a + "\nb = " + b + "\nRésultatsattendus : " + res+ "\nRésultatsobtenus : " + tri.Tritype(a, b, c), tri.Tritype(a, b, c) == res);
		
		
		
		BufferedReader br=null;
		File file=null;
		try {
			file = new File("C:\\triangle\\triangleAvecOption2.txt");
			br = new BufferedReader(new FileReader(file));
			int i=1;
			while ((str = br.readLine()) != null){
				ligne = str.split(";");
				a = Double.parseDouble(ligne[0]);
				b = Double.parseDouble(ligne[1]);
				c = Double.parseDouble(ligne[2]);
				res = Integer.parseInt(ligne[3]);
				
				assertTrue("Cas de test ligne : " + i + " \na = " + a + "\nb = " + b + "\nRésultatsattendus : " + res+ "\nRésultatsobtenus : " + tri.Tritype(a, b, c), tri.Tritype(a, b, c) == res);
				i++;
			}
			    //System.out.println(st);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		  
						
						
		
		

	} 
	}

