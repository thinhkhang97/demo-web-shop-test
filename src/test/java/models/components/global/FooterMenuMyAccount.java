package models.components.global;

import models.components.Component;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FooterMenuMyAccount extends Component {

    private final By columnSel = By.cssSelector("div.footer > div.footer-menu-wrapper > div.column.my-account > h3");
    private final By itemsSel = By.cssSelector("div.footer-menu-wrapper > div.column.my-account > ul > li > a");

    public WebElement myAccountColumnTitle() {
        return this.driver.findElement(columnSel);
    }

    public List<WebElement> myAccountItems() {
        return this.driver.findElements(itemsSel);
    }

    public FooterMenuMyAccount(WebDriver driver) {
        super(driver);
    }
}
