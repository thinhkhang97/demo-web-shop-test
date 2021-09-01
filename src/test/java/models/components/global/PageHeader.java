package models.components.global;

import models.components.Component;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageHeader extends Component {

    final private By headerLogoSel = By.cssSelector("div.header-logo > a > img");

    final private HeaderLinks headerLinks;

    final private HeaderSearchBar headerSearchBar;

    public PageHeader(WebDriver driver) {
        super(driver);
        this.headerLinks = new HeaderLinks(driver);
        this.headerSearchBar = new HeaderSearchBar(driver);
    }

    public WebElement headerLogo() {
        return this.driver.findElement(headerLogoSel);
    }

    public WebElement headerLinkItem(String name) {
        return this.headerLinks.getHeaderLink(name);
    }

    public HeaderSearchBar getHeaderSearchBar() {
        return this.headerSearchBar;
    }
}
