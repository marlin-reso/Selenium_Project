package php.crm.vtiger.project1.pomRepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewCampaignPage {
	
	public CreatingNewCampaignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id ="Campaigns_editView_fieldName_campaignname")
	private WebElement campaignNameTextField;
	
	@FindBy(id ="Campaigns_editView_fieldName_closingdate")
	private WebElement expectedCloseingDateCalender;
	
	
	@FindBy(xpath ="//button[@class='btn btn-success saveButton']")
	private WebElement saveButton;


	public WebElement getCampaignNameTextField() {
		return campaignNameTextField;
	}


	public WebElement getExpectedCloseingDateCalender() {
		return expectedCloseingDateCalender;
	}


	public WebElement getSaveButton() {
		return saveButton;
	}
	public void createNewCampaignAction(String campaingName,String date) {
		
		campaignNameTextField.sendKeys(campaingName);
		expectedCloseingDateCalender.sendKeys(date);
		expectedCloseingDateCalender.sendKeys(Keys.ENTER);
		saveButton.click();
		
	}

}
