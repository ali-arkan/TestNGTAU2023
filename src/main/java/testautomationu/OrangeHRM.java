package testautomationu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.Test;




public class OrangeHRM {

    WebDriver driver;

    @BeforeMethod
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Repo\\Courses\\TestNGTAU2023\\TestNGTAU2023\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println("1. Open Chrome & Application");

    }

    @Test
    public void signIn()
    {
        WebElement textUsername = driver.findElement(By.name("username"));
       textUsername.sendKeys("Admin");
    }

    @AfterMethod
    public void tearDown()
    {
        System.out.println("5. Close Chrome & Application");
        driver.quit();
    }




}
