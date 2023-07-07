package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy (name="username")private WebElement usernameTB;
	@FindBy (name="pwd")private WebElement passwordTB;
	@FindBy (id="LoginButton")private WebElement loginButton;
	@FindBy (xpath="//input[@name='remember']")private WebElement checkBox;
	@FindBy (linkText="Actimind Inc.")private WebElement actimindLink;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getUsernameTB() {
		return usernameTB;
	}
	public void setUsernameTB(WebElement usernameTB) {
		this.usernameTB = usernameTB;
	}
	public WebElement getPasswordTB() {
		return passwordTB;
	}
	public void setPasswordTB(WebElement passwordTB) {
		this.passwordTB = passwordTB;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}
	public WebElement getCheckBox() {
		return checkBox;
	}
	public void setCheckBox(WebElement checkBox) {
		this.checkBox = checkBox;
	}
	public WebElement getActimindLink() {
		return actimindLink;
	}
	public void setActimindLink(WebElement actimindLink) {
		this.actimindLink = actimindLink;
	}
	public void validLogin(String validusername,String validpassword) throws InterruptedException
	{
		usernameTB.sendKeys(validusername);
		Thread.sleep(2000);
		passwordTB.sendKeys(validpassword);
		Thread.sleep(2000);
		loginButton.click();
	}
	 public void inValidLogin(String invalidUsername,String invalidPassword) throws InterruptedException
     {
    	 usernameTB.sendKeys(invalidUsername);
    	 passwordTB.sendKeys(invalidPassword);
    	 loginButton.click();
    	 Thread.sleep(2000);
    	 usernameTB.clear();
     }


}
