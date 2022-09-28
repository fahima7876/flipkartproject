package LoginModule;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericUtility.BaseTestBaseClass;
import GenericUtility.ReadExcel;
import ObjectRepository.LoginPage;

public class Nametc2_Test extends BaseTestBaseClass{
	@Test(dataProvider = "testdata", dataProviderClass = ReadExcel.class)

	public void checkWithDifferentData(String data1) {
		LoginPage login=new LoginPage(driver);
		
		//login
		//login.getLoginLink().click();
		//login.getEmailTextField().sendKeys(data1);
		//login.getPasswordTextField().sendKeys(data2);
		//login.getLoginButton().click();		
		
		
		
//		driver.findElement(By.linkText("Register")).click();
//		login.getFirstnameTextField().sendKeys(data1);
//		login.getLastnameTextField().sendKeys(data2);
//		login.getEmailTextField().sendKeys(data3);
//		login.getPasswordTextField().sendKeys(data4);
//		login.getConfirmPasswordTextField().sendKeys(data5);
//		
	

		driver.findElement(By.linkText("small-searchterms")).click();
		login.getSmallsearchterms().sendKeys(data1);
}
}