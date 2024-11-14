
package testcase;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Conftest.confi;

public class Reporting extends confi{
	
	private static final String SCREENSHOT_PATH = System.getProperty("user.dir") + "/test-output/screenshots/";
	private WebDriverWait wait;

	@BeforeClass
		public void setupClass() {
        // Create screenshots directory if it doesn't exist
        new File(SCREENSHOT_PATH).mkdirs();
		}
    
	
	@BeforeMethod


		public void launchBrowser() throws InterruptedException 
			{
				openBrowser();
				LoginCredentials();
				//ProgramChanging();
				pChanging();
			}
	
 	@AfterMethod
    	public void tearDown(ITestResult result) {
        // Take screenshot on test failure
        if (result.getStatus() == ITestResult.FAILURE) {
            takeScreenshot("FAILED_" + result.getName());
        }
        
        if (driver != null) {
            driver.quit();
        }
    }
    


@Test

//Test Case to Click Executive Summary Report and Heatmap Report
public void openReports() throws InterruptedException
{
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//ProgramChanging();
	Thread.sleep(5000);
	ExecSummary();
	driver.navigate().back();
	Heatmap();
	driver.navigate().back();
} 

@Test
//Test Case to click more button
public void TC_02() throws InterruptedException
{
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	ExecSummary();
	moree();
	Thread.sleep(5000);
	driver.quit();
}

@Test
//Test Case to click settings button
public void TC_03() throws InterruptedException
{
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	ExecSummary();
	SettingsButton();
}

@Test
//Test Case to click export button
public void TC_04() throws InterruptedException
{
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	ExecSummary();
	ReportExport();
	driver.quit();
}


@Test

public void TC_05() throws InterruptedException
{
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	OpenComments();
	driver.quit();
}

@Test

public void TC_06() throws InterruptedException
{
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	OpenOvr();
	Screenshot_Scores();
	Thread.sleep(5000);
	driver.quit();
}


}
	