package php.crm.vtiger.project1.genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryAnalyzerImplementetionClass implements IRetryAnalyzer{
	
	int count = 0;
	int limit = 3;
	
	
	public boolean retry(ITestResult result) {
		
		while (count<limit) {
			
			
			count++;
			return true;
		}
		
		
		
		return false;
	}

}
