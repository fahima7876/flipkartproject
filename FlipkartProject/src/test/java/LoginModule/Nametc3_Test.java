package LoginModule;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import GenericUtility.ReadExcel;
import ObjectRepository.LoginPage;

public class Nametc3_Test {
	@Test(dataProvider = "testdata", dataProviderClass = ReadExcel.class)

	public void checkWithDifferentData(String data1, String data2, WebDriver driver) {
		LoginPage login=new LoginPage(driver);
		login.getLoginLink().click();
		login.getEmailTextField().sendKeys(data1);
		login.getPasswordTextField().sendKeys(data2);
		login.getLoginButton().click();	
}
}