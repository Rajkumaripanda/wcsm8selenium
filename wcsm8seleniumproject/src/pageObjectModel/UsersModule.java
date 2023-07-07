package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersModule {
	@FindBy(xpath="//input[@value='Create New User']")private WebElement createnewuser;
	@FindBy(xpath="//input[@name='username']")private WebElement usernametextbox;
	@FindBy(xpath="//input[@name='firstName']")private WebElement firstname;
	@FindBy(xpath="//input[@name='lastName']")private WebElement lastname;
	@FindBy(xpath="//input[@name='passwordText']")private WebElement passwordtextbox;
	@FindBy(xpath="//input[@name='passwordTextRetype']")private WebElement retypepass;
	@FindBy(xpath="//input[@name='overtimeTracking']")private WebElement overtimecheckbox;
	@FindBy(xpath="//input[@name='rightGranted[9]']")private WebElement entertimecheckbox;
	@FindBy(xpath="//input[@type='submit']")private WebElement createuserbutton;
	@FindBy(xpath="//input[@id='cleanupDemoDataButton']")private WebElement cancelbutton;
	@FindBy(xpath="//input[@value='Delete This User']")private WebElement deleteuserbutton;
	@FindBy(xpath="//a[@href='/administration/useredit.do?noReload=false&userId=9']/ancestor::tbody/descendant::a[1]")private WebElement userlink;
	
	public  UsersModule(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getCreatenewuser() {
		return createnewuser;
	}
	public void setCreatenewuser(WebElement createnewuser) {
		this.createnewuser = createnewuser;
	}
	public WebElement getUsernametextbox() {
		return usernametextbox;
	}
	public void setUsernametextbox(WebElement usernametextbox) {
		this.usernametextbox = usernametextbox;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public void setFirstname(WebElement firstname) {
		this.firstname = firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public void setLastname(WebElement lastname) {
		this.lastname = lastname;
	}
	public WebElement getPasswordtextbox() {
		return passwordtextbox;
	}
	public void setPasswordtextbox(WebElement passwordtextbox) {
		this.passwordtextbox = passwordtextbox;
	}
	public WebElement getRetypepass() {
		return retypepass;
	}
	public void setRetypepass(WebElement retypepass) {
		this.retypepass = retypepass;
	}
	public WebElement getOvertimecheckbox() {
		return overtimecheckbox;
	}
	public void setOvertimecheckbox(WebElement overtimecheckbox) {
		this.overtimecheckbox = overtimecheckbox;
	}
	public WebElement getEntertimecheckbox() {
		return entertimecheckbox;
	}
	public void setEntertimecheckbox(WebElement entertimecheckbox) {
		this.entertimecheckbox = entertimecheckbox;
	}
	public WebElement getCreateuserbutton() {
		return createuserbutton;
	}
	public void setCreateuserbutton(WebElement createuserbutton) {
		this.createuserbutton = createuserbutton;
	}
	public WebElement getCancelbutton() {
		return cancelbutton;
	}
	public void setCancelbutton(WebElement cancelbutton) {
		this.cancelbutton = cancelbutton;
	}
	
	public WebElement getDeleteuserbutton() {
		return deleteuserbutton;
	}
	public void setDeleteuserbutton(WebElement deleteuserbutton) {
		this.deleteuserbutton = deleteuserbutton;
	}
	public void CreateUserMethod(String usn,String pass, CharSequence fn, CharSequence ln) throws InterruptedException
	{
		createuserbutton.click();
		usernametextbox.sendKeys(usn);
		createuserbutton.click();
		passwordtextbox.sendKeys(pass);
		retypepass.sendKeys(pass);
		Thread.sleep(2000);
		
		firstname.sendKeys(fn);
		Thread.sleep(2000);
        lastname.sendKeys(ln);
		Thread.sleep(2000);
        createuserbutton.click();
		

		
	}
	public void DeleteUserMethod() throws InterruptedException
	{
		userlink.click();
		Thread.sleep(2000);

		deleteuserbutton.click();
		
		
	}
	
	

	

}
