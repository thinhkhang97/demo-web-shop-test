package drivers;

import org.openqa.selenium.WebDriver;

public abstract class DriverFactory {
    /**
     * Get Selenium web driver
     *
     * @return Web driver
     */
    public abstract WebDriver getDriver();

    /**
     * Get current web driver location path to create driver
     *
     * @return Web driver location
     */
    abstract String getWebDriverLocationPath();

    String getCurrentLocation() {
        return System.getProperty("user.dir");
    }

    String getCurrentWebDriverLocation() {
        return System.getProperty("user.dir") + getWebDriverLocationPath();
    }
}
