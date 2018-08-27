package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class test {


	@Test
	void testConvert() {
		int tool;
		int sens;
		double val;
		double res;
		
		
		tool = 1; sens = 1; val = 500 ; res= 932;
		assertTrue( Convert.Convert(tool, sens, val) == res,"Cas de test : tool = 1; sens = 1; val = 500\nTool = " + tool + "\nSens = " + sens + "\nVal = " + val +"\nRésultatsattendus : " + res+ "\nRésultatsobtenus : " + Convert.Convert(tool, sens, val));
		tool = 1; sens = 1; val = -100 ; res= -148.0;
		assertTrue( Convert.Convert(tool, sens, val) == res,"Cas de test : tool = 1; sens = 1; val = -100\nTool = " + tool + "\nSens = " + sens + "\nVal = " + val +"\nRésultatsattendus : " + res+ "\nRésultatsobtenus : " + Convert.Convert(tool, sens, val));
		tool = 1; sens = 1; val = 200 ; res= 392.0;
		assertTrue( Convert.Convert(tool, sens, val) == res,"Cas de test : tool = 1; sens = 1; val = 200\nTool = " + tool + "\nSens = " + sens + "\nVal = " + val +"\nRésultatsattendus : " + res+ "\nRésultatsobtenus : " + Convert.Convert(tool, sens, val));
		tool = 1; sens = 2; val = 500 ; res= 260;
		assertTrue( Convert.Convert(tool, sens, val) == res,"Cas de test : tool = 1; sens = 2; val = 500\nTool = " + tool + "\nSens = " + sens + "\nVal = " + val +"\nRésultatsattendus : " + res+ "\nRésultatsobtenus : " + Convert.Convert(tool, sens, val));
		tool = 1; sens = 2; val = 200 ; res= 93.33333333333333;
		assertTrue( Convert.Convert(tool, sens, val) == res,"Cas de test : tool = 1; sens = 2; val = 200\nTool = " + tool + "\nSens = " + sens + "\nVal = " + val +"\nRésultatsattendus : " + res+ "\nRésultatsobtenus : " + Convert.Convert(tool, sens, val));
		tool = 1; sens = 1; val = 600 ; res= 0;
		assertTrue( Convert.Convert(tool, sens, val) == res,"Cas de test : tool = 1; sens = 1; val = 600\nTool = " + tool + "\nSens = " + sens + "\nVal = " + val +"\nRésultatsattendus : " + res+ "\nRésultatsobtenus : " + Convert.Convert(tool, sens, val));
		
		tool = 2; sens = 1; val = 100000 ; res= 160934;
		assertTrue( Convert.Convert(tool, sens, val) == res,"Cas de test : tool = 2; sens = 1; val = 100000\nTool = " + tool + "\nSens = " + sens + "\nVal = " + val +"\nRésultatsattendus : " + res+ "\nRésultatsobtenus : " + Convert.Convert(tool, sens, val));
		tool = 2; sens = 3; val = 100000 ; res= 0;
		assertTrue( Convert.Convert(tool, sens, val) == res,"Cas de test : tool = 2; sens = 1; val = 100000\nTool = " + tool + "\nSens = " + sens + "\nVal = " + val +"\nRésultatsattendus : " + res+ "\nRésultatsobtenus : " + Convert.Convert(tool, sens, val));
		tool = 2; sens = 2; val = 100 ; res= 62.137273664980675;
		assertTrue( Convert.Convert(tool, sens, val) == res,"Cas de test : tool = 2; sens = 2; val = 100000\nTool = " + tool + "\nSens = " + sens + "\nVal = " + val +"\nRésultatsattendus : " + res+ "\nRésultatsobtenus : " + Convert.Convert(tool, sens, val));
		tool = 2; sens = 1; val = -1 ; res= 0;
		assertTrue( Convert.Convert(tool, sens, val) == res,"Cas de test : tool = 2; sens = 1; val = -1\nTool = " + tool + "\nSens = " + sens + "\nVal = " + val +"\nRésultatsattendus : " + res+ "\nRésultatsobtenus : " + Convert.Convert(tool, sens, val));
		tool = 3; sens = 1; val = 500 ; res= 0;
		assertTrue( Convert.Convert(tool, sens, val) == res,"Cas de test : tool = 3; sens = 1; val = 500\nTool = " + tool + "\nSens = " + sens + "\nVal = " + val +"\nRésultatsattendus : " + res+ "\nRésultatsobtenus : " + Convert.Convert(tool, sens, val)); 
		
	}
	
}
