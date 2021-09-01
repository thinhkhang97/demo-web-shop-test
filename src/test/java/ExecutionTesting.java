import drivers.ChromeDriverFactory;
import drivers.DriverFactory;
import org.openqa.selenium.WebDriver;
import pageTest.HomeTest;

public class ExecutionTesting {
    public static void main(String[] args) {
        DriverFactory driverFactory = new ChromeDriverFactory();
        WebDriver driver = driverFactory.getDriver();

        HomeTest homeTest = new HomeTest(driver);
        homeTest.start();
    }
}
