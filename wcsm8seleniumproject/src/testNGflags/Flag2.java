package testNGflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
  @Test(priority = 1)
  public void c() {
	  Reporter.log("c method",true);
  }
  @Test(priority = 2)
  public void a() {
	  Reporter.log("a method",true);
	  

  }
  @Test(priority = -1)
  public void d() {
	  Reporter.log("d method",true);

  }
  @Test
  public void x() {
	  Reporter.log("x method",true);

  }
  @Test
  public void f() {
	  Reporter.log("f method",true);

  }
}
