package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	//@FindBy(id = "Email")
	//private WebElement EmailTextField;
	
	//public WebElement getLoginLink() {
		//return loginLink;
	//}

	//public WebElement getEmailTextField() {
		//return EmailTextField;
	//}

	//public WebElement getPasswordTextField() {
		//return PasswordTextField;
	//}

	//public WebElement getLoginButton() {
		//return LoginButton;
	//}
	//@FindBy(id = "Password")
	//private WebElement PasswordTextField;
	
	//@FindBy(xpath = "//input[@value='Log in']")
	//private WebElement LoginButton;
	
	//testcase2_script
//	@FindBy(linkText = "Register")
//	private WebElement Register;
//	
//	
//	public WebElement getFirstnameTextField() {
//		return FirstNameTextField;
//	}
//	public WebElement getLastnameTextField() {
//		return LastNameTextField;
//	}
//	public WebElement getEmailTextField() {
//		return EmailTextField;
//	}
//	public WebElement getPasswordTextField() {
//		return PasswordTextField;
//	}
//	public WebElement getConfirmPasswordTextField() {
//		return ConfirmPasswordTextField;
//	}
//	@FindBy(id = "FirstName")
//	private WebElement FirstNameTextField;
//	
//	@FindBy(id = "LastName")
//	private WebElement LastNameTextField;
//	
//	@FindBy(id = "Email")
//	private WebElement EmailTextField;
//	
//	@FindBy(id = "Password")
//	private WebElement PasswordTextField;
//	
//	@FindBy(id = "ConfirmPassword")
//	private WebElement ConfirmPasswordTextField;
//	
//	@FindBy(xpath = "//input[@value='Register']")
//	private WebElement RegisterButton;
//	

	
	@FindBy(linkText = "small-searchterms")
    private WebElement smallsearchterms;
	
	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getSmallsearchterms() {
		return smallsearchterms;
	}

	public WebElement getSearchButton() {
		return SearchButton;
	}

	
		
		@FindBy(xpath = "//input[@value='small-searchterms']")
        private WebElement SearchButton;
		

}
