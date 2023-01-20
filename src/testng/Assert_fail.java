package testng;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_fail {
	@Test 
	public void h1() {
		Reporter.log("running tc1",true);
		Assert.fail();
		System.out.println("i m after failing tc1");
	}
	@Test
	public void h2() {
		Reporter.log("running test case 2",true);
	}

}
