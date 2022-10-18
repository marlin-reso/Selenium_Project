package php.crm.vtiger.project1.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {
	
	
	public LeadsPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//button[@id='Leads_listView_basicAction_LBL_ADD_RECORD']")
	private WebElement addLeadButton;

	public WebElement getAddLeadButton() {
		return addLeadButton;
	}
	
	public void clickOnAddLead() {
		addLeadButton.click();
	}
	

}
