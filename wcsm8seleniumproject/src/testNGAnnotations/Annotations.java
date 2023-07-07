package testNGAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
  @Test
  public void f() {
	  Reporter.log("f method",true);
  }
  @Test
  public void g()
  {
	  Reporter.log("g method",true);

  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("before method",true);

  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("after method",true);

  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("before class",true);

  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("after class",true);

  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("beforeTest method",true);

  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("afterTest method",true);

  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("beforeSuite method",true);

  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("afterSuite method",true);

  }

}
