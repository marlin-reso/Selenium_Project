package php.crm.vtiger.project1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import php.crm.vtiger.project1.genericUtility.BaseClass;
import php.crm.vtiger.project1.genericUtility.ExcelUtility;
import php.crm.vtiger.project1.genericUtility.IPathConstant;
import php.crm.vtiger.project1.pomRepository.CreatingNewLeadPage;
import php.crm.vtiger.project1.pomRepository.HomePage;
import php.crm.vtiger.project1.pomRepository.LeadsDetailsPage;
import php.crm.vtiger.project1.pomRepository.LeadsPage;

public class CreateLeadTest extends BaseClass{
	
	@Test
	public void createLeadAndVerifyLeadsNameTest() throws EncryptedDocumentException, IOException {
		
		HomePage home1 = new HomePage(driver);
		home1.clickOnLeadsOption();
		
		LeadsPage lead = new LeadsPage(driver);
		lead.clickOnAddLead();
		
	//	int randomNo = jutils.generateRandomNumber(IPathConstant.RANDOM_NUMBER);
		
		ExcelUtility eUtils = new ExcelUtility();
		String lastName = eUtils.fetchDataFromExcelFile("sheet3", 1, 0);
		String expectedLastName = lastName;
		
		CreatingNewLeadPage newLastname = new CreatingNewLeadPage(driver);
		newLastname.createNewLeadAction(lastName);
		
		LeadsDetailsPage lastnameDetails = new LeadsDetailsPage(driver);
		
		String actualLastname = lastnameDetails.verifyLeadsName(lastName);
		
		System.out.println(expectedLastName);
		System.out.println(actualLastname);
		
		Assert.assertEquals(actualLastname, expectedLastName);
		System.out.println("lastname is verified");
			
	}
	
}
