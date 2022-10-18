package php.crm.vtiger.project1.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

public class JavaUtility {
	
	public int generateRandomNumber(int limit) {
		
		Random random = new Random();
		return random.nextInt(limit);
	}
	
	public String generateSystemDataTime() {
		
		return new Date().toString();
	}
	
	public String fetchDataFromPropertyFile(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream(IPathConstant.PROPERTY_PATH);
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
		
		
	}

}
