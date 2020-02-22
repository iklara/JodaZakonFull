package test.com;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import walutkonwenter.main;


public class test {
	
	@Test
	public void test1(){
		assertTrue(main.zamienEurPln(412) == 100);
		System.out.println("test1");
	
}
	@Test
	public void test2(){
		assertTrue(main.zamienPlnEur(100)==412);
		System.out.println("test2 success");
	
}
	
	@Test
	public void test3(){
		assertTrue(main.zamienPlnUsd(100)==300);
		System.out.println("test3 success");
		
	}
	
	@Test
	public void test4(){
		assertTrue(main.zamienUsdPln (300)==100);
		System.out.println("test4 success");
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

