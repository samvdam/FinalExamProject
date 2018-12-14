package PkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class FinalTest {

	@Test
	class FinalTest {

		@Test
		void test() {
			Retirement r=new Retirement(40,.07,20,.02,10000,2642);
			System.out.println(r.AmountToSave()+" "+r.TotalAmountSaved());
			assertTrue(true);
		}

	}

}
