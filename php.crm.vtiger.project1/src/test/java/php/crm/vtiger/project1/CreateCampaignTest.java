
package php.crm.vtiger.project1;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import php.crm.vtiger.project1.genericUtility.BaseClass;
import php.crm.vtiger.project1.genericUtility.ExcelUtility;
import php.crm.vtiger.project1.genericUtility.IPathConstant;
import php.crm.vtiger.project1.pomRepository.CampaignDetailPage;
import php.crm.vtiger.project1.pomRepository.CampaignsPage;
import php.crm.vtiger.project1.pomRepository.CreatingNewCampaignPage;
import php.crm.vtiger.project1.pomRepository.HomePage;


@Listeners(php.crm.vtiger.project1.genericUtility.ListenersImplementationClass.class)
public class CreateCampaignTest extends BaseClass{
	@Test(retryAnalyzer = php.crm.vtiger.project1.genericUtility.IRetryAnalyzerImplementetionClass.class)
	public void createCampaignAndVerifyCampaignNameTest() throws EncryptedDocumentException, IOException{
		
		HomePage home1 = new HomePage(driver);
		home1.clickOnCampaignOption();
	
		CampaignsPage campaign=new CampaignsPage(driver);
		campaign.clickOnAddCampaign();
		
		int randomNo = jutils.generateRandomNumber(IPathConstant.RANDOM_NUMBER);
		
		ExcelUtility eUtils = new ExcelUtility();
		String campaignName = eUtils.fetchDataFromExcelFile(IPathConstant.SHEET_NAME, 1, 0);
		String expectedCampaignName = campaignName+randomNo;
		String date = eUtils.fetchDataFromExcelFile(IPathConstant.SHEET_NAME, 1, 1);
		
		CreatingNewCampaignPage newCampaign = new CreatingNewCampaignPage(driver);
		newCampaign.createNewCampaignAction(expectedCampaignName, date);
		
		//creating the object of campaign details page 
		
		CampaignDetailPage campaignDetails = new CampaignDetailPage(driver);
		
		//store it in actual details page for compare the name of campaign
		
		String actualCampaignName = campaignDetails.verifyCampaignName(campaignName);
		//Assert.fail();
		
		
		Assert.assertEquals(actualCampaignName, expectedCampaignName);
		System.out.println("Campaign Name is verified");
	}
	

}
