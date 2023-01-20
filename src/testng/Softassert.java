package testng;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert {
@Test
public void h1() {
	String s1 = "hi";
	String s2 = "hello";
	SoftAssert s = new SoftAssert();
	s.assertEquals(s1, s2);
	System.out.println("i m after failing ");
}
}
