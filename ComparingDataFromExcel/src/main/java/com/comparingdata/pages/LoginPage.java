package com.comparingdata.pages;
import com.dataprovider.excelsheet.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.datainput.testng.*;
public class LoginPage {

	public void get_Login() throws Exception {

		DataProviderInput.driver.get(XMLPathsData.getFbURL());
		DataProviderInput.driver.findElement(By.id(XMLPathsData.getEmailID())).sendKeys(ValuesStored.getUserValue()); 
		DataProviderInput.driver.findElement(By.id(XMLPathsData.getPasswordID())).sendKeys(ValuesStored.getPassValue());
		DataProviderInput.driver.findElement(By.id(XMLPathsData.getLoginButtonID())).click();
		Thread.sleep(5000);
	}
}
