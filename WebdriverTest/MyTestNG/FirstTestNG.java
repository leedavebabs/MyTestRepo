package MyTestNG;

import org.testng.annotations.Test;

import WebdriverTest.WebdriverTest.TestBase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FirstTestNG extends TestBase {
	HomePage homePage = new HomePage();
		@parameters( {"deptc","arrc","deptd","arrd"} )
	  @Test
	  public void MyTest(String deptc, String arrc, String deptd, String arrd) {
		  
		  
	  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
