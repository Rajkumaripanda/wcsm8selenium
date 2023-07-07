package testNGpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void add() {
	  
	  Reporter.log("add method",true);
  }
  @Test
  public void sub()
  {
	  Reporter.log("sub method",true);
  }
  @Test
  public void fact()
  {
	  Reporter.log("fact method",true);
  }
}
