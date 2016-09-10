package WebdriverTest.WebdriverTest;

import org.testng.annotations.Test;

import PageClasses.AnotherPage;
import PageClasses.HomePage;

public class FirstTesting extends TestBase {
	
	
  @Test
  public void MyTest() throws InterruptedException {
	HomePage homePage = new HomePage(driver);
	homePage.setDept("lagos");
	homePage.setArr("abuja");
	//homePage.setDeptDate("20/09/2016");
	//homePage.setArrDate("24/09/2016");
	//homePage.textBox();  
	//homePage.end();  
	homePage.clickSearch();
	  
  }
}
