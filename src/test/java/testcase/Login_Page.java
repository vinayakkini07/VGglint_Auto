/*package testcase;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Conftest.confi;

public class Login_Page extends confi{
	
@BeforeMethod


}
*/

package testcase;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Conftest.confi;

public class Login_Page extends confi{
	
	
@BeforeMethod

//@Test
public void launchBrowser() throws InterruptedException 
{
	openBrowser();
	LoginCredentials();
	//ProgramChanging();
	pChanging();
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
	