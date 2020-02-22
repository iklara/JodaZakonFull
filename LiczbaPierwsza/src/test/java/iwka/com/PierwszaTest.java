package iwka.com;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.iwka.LiczbaPierwsza;

@RunWith(Parameterized.class)
public class PierwszaTest {

	private Integer daneWejsciowe;
	private Boolean odpowiedz;
	
	public PierwszaTest (Integer daneWejsciowe, Boolean odpowiedz) {
		
		this.daneWejsciowe = daneWejsciowe;
		this.odpowiedz = odpowiedz;
	}
	
	@Parameterized.Parameters
	public static Object [][] dane (){
		
		Object[][] dane = new Object [][] {
			{2, true},
			{3, true},
			{4,true},
			{-5, false},
			{7, true},
			{71, true},
			
		};
		
		return dane;
	}
	
	@Test
	public void test() {
		Assert.assertTrue(LiczbaPierwsza.verify(daneWejsciowe)==odpowiedz);
	}
	
}
