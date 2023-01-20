package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class batch_excution1 {
	@Test
	public void p1() {
	Reporter.log("runing p1", true);
	}
	@Test
	public void p2() {
		Reporter.log("running p2",true);
	}
	@Test
	public void p3() {
	Reporter.log("runing p3", true);

	}

}
