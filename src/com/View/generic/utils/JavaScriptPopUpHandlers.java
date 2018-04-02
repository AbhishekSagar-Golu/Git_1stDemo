package com.View.generic.utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class JavaScriptPopUpHandlers {
	public static void clickOkOnJSPopup(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
	public static void clickCancelOnJSPopUp(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
	}
	public static String getMsgofJSpopup(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		String alt_msg =alt.getText();
		return alt_msg;
	}
	public static void enterTexttoJSpopup(WebDriver driver, String text)
	{
		Alert alt = driver.switchTo().alert();
		alt.sendKeys(text);
			
	}

}
