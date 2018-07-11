package com.datainput.testng;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.comparingdata.browser.BrowserConnection;
import com.comparingdata.pages.LoginPage;
import com.dataprovider.excelsheet.DataSheetIntake;
import com.dataprovider.excelsheet.ValuesStored;
import com.dataprovider.excelsheet.XMLPathsData;
public class DataProviderInput {

	public static WebDriver driver;
	public static BrowserConnection objBrowser;
	public static LoginPage objLogin;
	@BeforeTest
	public void Display() throws Exception{
		DataSheetIntake DSI=new DataSheetIntake();
		DSI.readExcel("E:\\Project\\ComparingDataFromExcel\\src", "DetailWorkBook.xlsx", "DetailSheet");
	}
	@DataProvider(name="Authentication")
	public static Object[][] credentials(){
		return new Object[][]{{ValuesStored.getUserValue(),ValuesStored.getPassValue(),ValuesStored.getCompareLoginValue()}};
	}
	@BeforeMethod
	public void getBrowserConnection() {
		objBrowser=new BrowserConnection();
		objBrowser.get_Browser_Connection();

	}
	@Test(dataProvider="Authentication")
	public void firefoxtest(String UserInput,String PassInput,String CompareInput) throws Exception{	
		objLogin=new LoginPage();
		objLogin.get_Login();
		Thread.sleep(5000);
		driver.quit();	
		Assert.assertEquals(XMLPathsData.getLoginButtonID(),ValuesStored.getCompareLoginValue(),"correct");
		System.out.println("Assert done");
	}
	@AfterTest
	public void TerminatedInfo() {
		System.out.println("Successfully processed");
	}
}
