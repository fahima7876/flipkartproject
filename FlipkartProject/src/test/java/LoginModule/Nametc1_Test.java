package LoginModule;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import GenericUtility.BaseTestBaseClass;
import GenericUtility.UtilityMethods;
import ObjectRepository.LoginPage;


public class Nametc1_Test extends BaseTestBaseClass {
	@Test
	
	public void _the__credentials_username_and_password() throws IOException {
	LoginPage login=new LoginPage(driver);
	Assert.assertEquals(true, false);
	login.getEmailTextField().sendKeys(UtilityMethods.ReadProperties("username"));
	login.getPasswordTextField().sendKeys(UtilityMethods.ReadProperties("password"));
	login.getLoginButton().click();
	
	
}
}