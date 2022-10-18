package php.crm.vtiger.project1.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(id ="appnavigator")
	private WebElement threeDashButton;
	
	@FindBy(xpath ="//span[text()=' MARKETING']")
	private WebElement marketingOption;
	
	@FindBy(xpath ="//span[text()=' Campaigns']")
	private WebElement campaignOption;
	
	@FindBy(xpath ="//a[@title='Leads']")
	private WebElement leadOption;
	
	public WebElement getLeadOption() {
		return leadOption;
	}

	public void setLeadOption(WebElement leadOption) {
		this.leadOption = leadOption;
	}

	@FindBy(xpath ="//a[@class='userName dropdown-toggle pull-right']")
	private WebElement logOutButton;
	
	@FindBy(id ="menubar_item_right_LBL_SIGN_OUT")
	private WebElement signOutButton;

	public WebElement getThreeDashButton() {
		return threeDashButton;
	}

	public WebElement getMarketingOption() {
		return marketingOption;
	}
	

	public WebElement getCampaignOption() {
		return campaignOption;
	}

	public WebElement getLogOutButton() {
		return logOutButton;
	}

	public WebElement getSignOutButton() {
		return signOutButton;
	}
		
	public void clickOnCampaignOption() {
		
		threeDashButton.click();
		marketingOption.click();
		campaignOption.click();	
	}
	
	public void clickOnLeadsOption() {
		
		threeDashButton.click();
		marketingOption.click();
		leadOption.click();
		
	}
	public void clickOnContactsOption() {
		
		threeDashButton.click();
		marketingOption.click();
		
	}
	
	
	public void logOutAction() {
		logOutButton.click();
		signOutButton.click();	
	}

}
