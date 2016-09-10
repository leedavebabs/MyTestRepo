package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='intlDeptCode']")
	WebElement dept;
	
	@FindBy(id="ui-id-71")
	WebElement lag;
	
	@FindBy(xpath="//input[@id='intlArrvCode']")
	WebElement arr;
	
	@FindBy(id="ui-id-73")
	WebElement abj;
	
	@FindBy(xpath="//tr[4]/td[3]")
	WebElement deptDate;
	
	@FindBy(xpath="//tr[4]/td[7]")
	WebElement arrvDate;
	
	@FindBy(xpath="//select[@id='adults']/option[@value='1']")
	WebElement noOfAdult;
	
	@FindBy(xpath="//select[@id='fltchildren']/option[@value='0']")
	WebElement noOfChild ;
	
	@FindBy(id="btnSearch")
	WebElement btnSearch;
	
	@FindBy(xpath="//*[@id='toast-container']/div/button")
	WebElement campaign;
	
	public HomePage(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
					}
		public void setDept(String deptu) throws InterruptedException{
			dept.sendKeys(deptu);
			Thread.sleep(3000);
			//lag.click();
			}
		
		public void setArr(String arru) throws InterruptedException{
			arr.sendKeys(arru);
			Thread.sleep(3000);
			
			//abj.click();
			}
		/*public void setDeptDate(String deDate){
			
			deptDate.click();
					}
		public void setArrDate(String arDate){
			
			arrvDate.click();
		}*/
		
		public void clickSearch(){
			campaign.click();
			btnSearch.click();
		}
		
		
}

	
