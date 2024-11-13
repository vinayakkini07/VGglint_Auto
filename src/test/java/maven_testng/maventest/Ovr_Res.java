package maven_testng.maventest;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Ovr_Res {

    public WebDriver driver;
	//public	Ovr_Res	overall;

    public Ovr_Res(WebDriver newDriver) {
        driver = newDriver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//button[normalize-space()='View all Comments']")
    @CacheLookup
    private WebElement comments;

    @FindBy(how = How.XPATH, using = "(//button)[13]")
    @CacheLookup
    private WebElement ovrres;

    @FindBy(how = How.XPATH, using = "//*[@id=\"section6201cc9f-6721-455e-81d6-ddeddc88fa21\"]")
    @CacheLookup
    private WebElement scores;


    public void clickcomments() {
        comments.click();
    }

    public void clickovrres() {
        ovrres.click();
    }

    public void Scores_ss() {
        scores.getScreenshotAs(OutputType.FILE).renameTo(new File("C:\\Users\\vkini01\\OneDrive - dentsu\\Pictures\\Saved Pictures\\test.png"));
    }
}
