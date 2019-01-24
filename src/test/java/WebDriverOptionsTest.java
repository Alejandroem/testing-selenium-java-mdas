import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class WebDriverOptionsTest {
    public static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public static WebDriver driver;

    @Test
    public void testWebDrive() throws InterruptedException
    {
        LOGGER.debug("start testWebDrive");

        System.setProperty("webdriver.chrome.driver", "/home/alejandro/Maestria/chromedriver_linux64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        LOGGER.debug("Driver started");

        driver.get("https://the-internet.herokuapp.com");
        driver.getTitle();
        driver.getCurrentUrl();
        driver.getPageSource();
    }
}
