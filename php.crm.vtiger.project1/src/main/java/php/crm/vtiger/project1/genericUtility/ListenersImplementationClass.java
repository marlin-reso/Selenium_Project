package php.crm.vtiger.project1.genericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.google.common.io.Files;

public class ListenersImplementationClass implements ITestListener{
	
	public void onTestFailure(ITestResult result) {
		
		String testCaseName = result.getMethod().getMethodName();
		
		TakesScreenshot ts = (TakesScreenshot)BaseClass.sdriver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshots/"+testCaseName+".png");
	
		
		try {
			Files.copy(source, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
