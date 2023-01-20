package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class batch_excution2 {
	@Test
	public void m1() {
	Reporter.log("runing m1", true);
	}
	@Test
	public void m2() {
		Reporter.log("running m2",true);
	}
	@Test
	public void m3() {
	Reporter.log("runing m3", true);

	}

}
