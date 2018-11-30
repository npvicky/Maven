package Maven.Project;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {

	static WebDriver driver;
	
	public static WebDriver getDriver(String BrowserName) throws Exception {
		
	try {
		  if (BrowserName=="chrome") {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vignesh\\eclipse-workspace\\Maven\\drivers\\chromedriver.exe");
	    driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    } 
	}catch (Exception e) {
		e.printStackTrace();
		throw new Exception();
	}
	return driver;
}
	public String getAttributeValue(WebElement element) {
		String attribute=element.getAttribute("value");
		return attribute;
	}
	public String getTitle() {
	 String title= driver.getTitle();
	return title;
}
}