package models.components.global;

import models.components.Component;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageHeader extends Component {

    final private By headerLogoSel = By.cssSelector("div.header-logo > a > img");

    public WebElement headerLogo() {
        return this.driver.findElement(headerLogoSel);
    }

    public HeaderLinks headerLinks() {
        return new HeaderLinks(this.driver);
    }

    public HeaderSearchBar headerSearchBar() {
        return new HeaderSearchBar(this.driver);
    }

    public HeaderMenu headerMenu() {
        return new HeaderMenu(this.driver);
    }

    public WebElement headerLinkItem(String name) {
        return this.headerLinks().getHeaderLink(name);
    }

    public PageHeader(WebDriver driver) {
        super(driver);
    }


}
