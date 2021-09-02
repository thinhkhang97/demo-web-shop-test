package models.components.global;

import models.components.Component;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FooterMenuCustomerService extends Component {

    private final By columnSel = By.cssSelector("div.footer > div.footer-menu-wrapper > div.column.customer-service > h3");
    private final By itemsSel = By.cssSelector("div.footer-menu-wrapper > div.column.customer-service > ul > li > a");

    public WebElement customerServiceColumnTitle() {
        return this.driver.findElement(columnSel);
    }

    public List<WebElement> customerServiceItems() {
        return this.driver.findElements(itemsSel);
    }

    public FooterMenuCustomerService(WebDriver driver) {
        super(driver);
    }
}
