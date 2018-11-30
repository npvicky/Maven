package Maven.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NextPage {

	static WebDriver driver;
	@FindBy(partialLinkText="Recover Your Account")
	private WebElement recoverbtn;
	
	public NextPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getRecoverbtn() {
	  return recoverbtn;
}

	public void setRecoverbtn(WebElement recoverbtn) {
		this.recoverbtn=recoverbtn;
	}
}