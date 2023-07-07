package testNGpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
  @Test
  public void demo() {
	  Reporter.log("demo method",true);
  }
  @Test
  public void sumo() {
	  Reporter.log("sumo method",true);
  }
  @Test
  public void remo() {
	  Reporter.log("remo method",true);
  }
}
