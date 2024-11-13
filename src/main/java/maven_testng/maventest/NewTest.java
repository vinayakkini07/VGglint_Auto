/*
/*package maven_testng.maventest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
    private WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.geckodriver.driver", "C:\\Users\\vkini01\\eclipse-workspace\\maventest\\server\\geckodriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.google.co.in");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Test11");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Test12");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Test1234");
    }

    @Test(priority = 1)
    public void f() {
        System.out.println("Hi");
    }

    @Test(priority = 2)
    public void a() {
        System.out.println("Bye");
    }
}*/
/*
package maven_testng.maventest;

import java.time.Duration;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterTest;

public class NewTest {
    private WebDriver driver;

    @BeforeMethod
    public void beforeClass() throws InterruptedException {
        System.setProperty("webdriver.geckodriver.driver", "C:\\Users\\vkini01\\eclipse-workspace\\maventest\\server\\geckodriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://app.glintqa.az.glintinc.com/session/auth");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("email")).sendKeys("qatester@glintinc.com");
		driver.findElement(By.xpath("/html/body/glint-session-root/div/glint-session-auth/form/section/footer/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("clientUuid")).sendKeys("qa20230929");
		driver.findElement(By.xpath("/html/body/glint-session-root/div/glint-session-client/form/section/footer/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("password")).sendKeys("Dem0@pass2");
		driver.findElement(By.xpath("/html/body/glint-session-root/div/glint-session-login/form/section/footer")).click();
		driver.findElement(By.linkText("Reports")).click();
		Thread.sleep(3000);
    }

    @Test(priority = 1)
    	public void Test_1() throws InterruptedException {
    		driver.findElement(By.xpath("//div[@class=\"header mcqReport\"]")).click();
    		Thread.sleep(10000);
    		driver.findElement(By.xpath("(//div[@class='menuButton glintButton'])[1]")).click();
    		Thread.sleep(2000);
    		String parentwid = driver.getWindowHandle();
    		System.out.println("Parent ID" + parentwid);
    		driver.findElement(By.xpath("//*[@id=\"option1\"]")).click();
    		driver.close();
    }

    @Test(priority = 2)
    public void a() {
        System.out.println("Bye");
    }
    
    @AfterMethod
    public void closedriver() {
        driver.quit();
    }
}
*/

