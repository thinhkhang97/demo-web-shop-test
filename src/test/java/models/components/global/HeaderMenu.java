package models.components.global;

import models.components.Component;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HeaderMenu extends Component {

    private final By headerMenuItemSel = By.cssSelector("div.header-menu > ul.top-menu > li > a");

    private final By computerItemSel = By.cssSelector("div.header-menu > ul.top-menu > li:nth-child(2) > a");

    private final By computerSubItemSel = By.cssSelector("div.header-menu > ul.top-menu > li:nth-child(2) > .sublist > li > a");

    private final By electronicsItemSel = By.cssSelector("div.header-menu > ul.top-menu > li:nth-child(3) > a");

    private final By electronicSubItemSel = By.cssSelector("div.header-menu > ul.top-menu > li:nth-child(3) > .sublist > li > a");

    public List<WebElement> headerMenuItems() {
        return this.driver.findElements(headerMenuItemSel);
    }

    public WebElement computerItem() {
        return this.driver.findElement(computerItemSel);
    }

    public List<WebElement> computerSubItems() {
        return this.driver.findElements(computerSubItemSel);
    }

    public WebElement electronicItem() {
        return this.driver.findElement(electronicsItemSel);
    }

    public List<WebElement> electronicSubItems() {
        return this.driver.findElements(electronicSubItemSel);
    }

    public HeaderMenu(WebDriver driver) {
        super(driver);
    }
}
