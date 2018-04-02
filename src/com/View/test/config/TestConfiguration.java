package com.View.test.config;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class TestConfiguration {
	
	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("---started suite execution---", true);
	}
@AfterSuite
public void afterSuite()
{
	Reporter.log("---ended suite Execution---",true);
	}
@BeforeClass
public void beforeClass()
{
	Reporter.log("---strted user story execution---",true);
	}
@AfterClass
public void afterClass()
{
	Reporter.log("---ended user story execution---",true);
	}
}
