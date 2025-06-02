package Lesson19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class LogoTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void checkLogoDisplayed() {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.header-logo")));

        WebElement logo = driver.findElement(By.cssSelector("a.header_logo svg"));
        if (logo.isDisplayed()) {
            System.out.println("Logo displayed");
        } else {
            System.out.println("Logo does not displayed");
        }
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
