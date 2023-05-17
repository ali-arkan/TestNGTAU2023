package testautomationu;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;


public class OrangeHRM {

    WebDriver driver;

    @BeforeMethod
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Repo\\Courses\\TestNGTAU2023\\TestNGTAU2023\\src\\main\\resources\\chromedriver.exe");
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println("1. Open Chrome & Application");



    }




}
