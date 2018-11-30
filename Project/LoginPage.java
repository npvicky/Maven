package Maven.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	static WebDriver driver;
	
	@FindBy(xpath="//img[@class='logo img-responsive']")
	private WebElement fblogo;
	
	@FindBy(id="pass")
	private WebElement passfld;
	
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement LoginBtn;
	
	public LoginPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFblogo() {
		return fblogo;
	}

	public void setFblogo(WebElement fblogo) {
		this.fblogo = fblogo;
	}

	public WebElement getPassfld() {
		return passfld;
	}

	public void setPassfld(WebElement passfld) {
		this.passfld = passfld;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}

	public void setLoginBtn(WebElement loginBtn) {
		LoginBtn = loginBtn;
	}

}
