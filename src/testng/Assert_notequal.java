package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_notequal {
	@Test
	public void g1() {
		Reporter.log("running from g1",true);
		String expT = "hi";
				String actT="hello";
				Assert.assertNotEquals(expT, actT);
		
	}

}
