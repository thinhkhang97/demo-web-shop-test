package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.util.concurrent.TimeUnit;

public class ChromeDriverFactory extends DriverFactory{

    @Override
    public WebDriver getDriver() {
        String currentChromeDriverLocation = this.getCurrentWebDriverLocation();
        System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, currentChromeDriverLocation);
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }

    @Override
    public String getWebDriverLocationPath() {
        return "\\src\\test\\resources\\drivers\\chromedriver.exe";
    }
}
