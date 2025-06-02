package Lesson19;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SignUpButtonColorTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void checkSignUpButtonColor() {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        WebElement signUpButton = driver.findElement(By.xpath("//button[text()='Sign up']"));

        String backgroundColor = signUpButton.getCssValue("background-color");

        // Цвет в RGB, потому что браузер возвращает именно его
        if (backgroundColor.equals("rgba(2, 117, 216, 1)")) {
            System.out.println("Background color of Sign up button is correct");
        } else {
            System.out.println("Background color of Sign up button is incorrect");
            System.out.println("Actual color: " + backgroundColor);
        }
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
