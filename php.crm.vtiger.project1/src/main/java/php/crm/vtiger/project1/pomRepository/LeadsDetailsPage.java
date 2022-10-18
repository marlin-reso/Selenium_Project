package php.crm.vtiger.project1.pomRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LeadsDetailsPage {
	
	WebDriver driver;
	
	public LeadsDetailsPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public String verifyLeadsName(String lastname) {
		
		return driver.findElement(By.xpath("//span[text()='"+lastname+"']")).getText();
	}
	
	

}
