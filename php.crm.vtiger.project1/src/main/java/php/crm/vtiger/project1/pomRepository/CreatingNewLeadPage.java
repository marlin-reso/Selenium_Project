package php.crm.vtiger.project1.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewLeadPage {
	
	public CreatingNewLeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//input[@name='lastname']")
	private WebElement lastNameTextField;
	
	@FindBy(xpath ="//button[text()='Save']")
	private WebElement saveButton;

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public void createNewLeadAction(String lastname) {
		
		lastNameTextField.sendKeys(lastname);
		saveButton.click();
		
		
		
	}
	
	

}
