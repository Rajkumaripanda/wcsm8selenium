package testNGflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
  @Test(description = "performs login..") 
  public void method1() {
	  Reporter.log("login method");
  }
  @Test
  public void method2()
  {
	  Reporter.log("logout method");

  }
}
