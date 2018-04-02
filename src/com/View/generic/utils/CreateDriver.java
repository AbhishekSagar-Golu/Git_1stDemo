package com.View.generic.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Developing functionality to create driver Instances
public class CreateDriver {
	public static WebDriver getDriverInstance()
	{
		String browserType= DataHandlers.getDataFromProperties("config", "browser");
		String url = DataHandlers.getDataFromProperties("config", "url");
		WebDriver driver =null;
		if(browserType.toLowerCase().equals("ff"))
		{
			System.setProperty("WebDriver.filefox.driver", "./browser-servers/geckodriver.exe");
			driver= new FirefoxDriver();	
		}
		else if(browserType.toLowerCase().equals("gc"))
		{
			System.setProperty("WebDriver.chrome.driver", "./browser-servers/chromedriver.exe");
			driver= new ChromeDriver();
		}
		else
		{
			System.err.println("--invalid browser Selection----");
		}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(url);
	 return driver;
	 }

}
