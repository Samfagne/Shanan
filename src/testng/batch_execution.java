package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class batch_execution {
@Test
public void e1() {
Reporter.log("runing e1", true);
}
@Test
public void e2() {
	Reporter.log("running e2",true);
}
@Test
public void e3() {
Reporter.log("runing e3", true);

}
}
