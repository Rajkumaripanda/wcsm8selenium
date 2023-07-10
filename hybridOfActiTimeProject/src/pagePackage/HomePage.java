package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//a[@class='logout']")private WebElement logoutlink;
	@FindBy(xpath="//a[@class='content users']/img[@class='sizer']")private WebElement usersmodule ;
	@FindBy(xpath="//A[@class='content tasks']/IMG[@class='sizer']")private WebElement taskmodule;
	@FindBy(xpath="//a[@class='content tt_selected selected']/div[2]/img")private WebElement timetrackmodule;
	@FindBy(xpath="//a[@class='content reports']/img[@class='sizer']")private WebElement reportmodule;
    @FindBy(xpath="//a[@class='content calendar']/descendant::img[@class='sizer']")private WebElement workSchedule;

	
	public WebElement getWorkSchedule() {
		return workSchedule;
	}



	public void setWorkSchedule(WebElement workSchedule) {
		this.workSchedule = workSchedule;
	}



	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}



	public WebElement getLogoutlink() {
		return logoutlink;
	}



	public void setLogoutlink(WebElement logoutlink) {
		this.logoutlink = logoutlink;
	}



	public WebElement getUsersmodule() {
		return usersmodule;
	}



	public void setUsermodule(WebElement usersmodule) {
		this.usersmodule = usersmodule;
	}



	public WebElement getTaskmodule() {
		return taskmodule;
	}



	public void setTaskmodule(WebElement taskmodule) {
		this.taskmodule = taskmodule;
	}



	public WebElement getTimetrackmodule() {
		return timetrackmodule;
	}



	public void setTimetrackmodule(WebElement timetrackmodule) {
		this.timetrackmodule = timetrackmodule;
	}



	public WebElement getReportmodule() {
		return reportmodule;
	}



	public void setReportmodule(WebElement reportmodule) {
		this.reportmodule = reportmodule;
	}
	public void logoutMethod()
	{
		logoutlink.click();
	}
	public void usersModuleMethod()
	{
		usersmodule.click();
	}
	public void taskModuleMethod()
	{
		taskmodule.click();
	}


	




}
