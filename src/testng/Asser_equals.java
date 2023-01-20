package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Asser_equals {
	@Test
	public void f1() {
		Reporter.log("running f1()",true);
		String expT= "hi";
		String actT="hi";
		//using asser class method
		Assert.assertEquals(expT, actT);
	}

}
