package com.comparingdata.browser;
import com.datainput.testng.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserConnection {

	public void get_Browser_Connection() {
		ProfilesIni profile = new ProfilesIni();
		FirefoxOptions opt=new FirefoxOptions();
		org.openqa.selenium.firefox.FirefoxProfile myprofile = profile.getProfile("MADHUMITA_V");
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		DataProviderInput.driver = new FirefoxDriver(opt);
		DataProviderInput.driver.manage().window().maximize();

	}
}
