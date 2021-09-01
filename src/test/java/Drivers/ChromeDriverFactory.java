package Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class ChromeDriverFactory extends DriverFactory{

    @Override
    WebDriver getDriver() {
        String currentChromeDriverLocation = this.getCurrentWebDriverLocation();
        System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, currentChromeDriverLocation);
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    @Override
    String getWebDriverLocationPath() {
        return "\\src\\test\\resources\\drivers\\chromedriver.exe";
    }

    public static void main(String[] args) {
        DriverFactory driverFactory = new ChromeDriverFactory();
        WebDriver driver = driverFactory.getDriver();

        driver.get("http://demowebshop.tricentis.com");
    }
}
