package test.com;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fd.com.Main;

public class test {
	
	@Test
	public void test1(){
		assertTrue(Main.karta(2)==kier && karta(3)==kier);
		System.out.println("test1");
	
}
	@Test
	public void test2(){
		assertTrue(Main.silnia(1)==1);
		System.out.println("test2");
	
}
	@Before
	public void przedTestem() {
		System.out.println("przed testem");
	}
	
	@After
	public void poTescie() {
		System.out.println("po tescie");
		
	}
	@BeforeClass
	public static void przedKlasa() {
		System.out.println("wykona sie przed kalsa");
	}
}