package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AnotherPage {
	WebDriver driver;
	WebElement element;
	
	public AnotherPage (WebDriver driver){
		this.driver=driver;
		//PageFactory.initElements(driver, this);
				}
		public void setDept(String deptu){
		element = driver.findElement(By.xpath("//input[@id='intlDeptCode']/"));
		element.sendKeys(deptu);
		//Thread.sleep(3000);
		//lag.click();
		}
	
	/*public void setArr(String arru) {
		element = driver.findElement(By.xpath("//input[@id='intlArrvCode']"));
		element.sendKeys(arru);
		//Thread.sleep(3000);
		//abj.click();
		}
	public void setDeptDate(String deDate){
		element = driver.findElement(By.id("deptDate"));
		element.sendKeys(deDate);
				}
	public void setArrDate(String arDate){
		element = driver.findElement(By.id("arrvDate"));
		element.sendKeys(arDate);
	}
	
	/*public void textBox(){
		element = driver.findElement(By.id("lst-ib"));
		element.sendKeys("Babawale");
	}*/
	public void end(){
		element = driver.findElement(By.xpath("//*[@id='toast-container']/div/button"));
		element.click();
	}	
	public void clickSearch(){
		element = driver.findElement(By.id("btnSearch"));
		element.click();
	}
	
}
