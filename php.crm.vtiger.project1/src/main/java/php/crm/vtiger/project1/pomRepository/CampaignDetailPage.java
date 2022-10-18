package php.crm.vtiger.project1.pomRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CampaignDetailPage {
	
	WebDriver driver;
	
	public CampaignDetailPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public String verifyCampaignName(String campaignName) {
		
		return driver.findElement(By.xpath("//span[contains(text(),'"+campaignName+"')]")).getText();
	}
	

}
