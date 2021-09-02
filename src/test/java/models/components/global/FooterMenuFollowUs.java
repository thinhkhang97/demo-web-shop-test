package models.components.global;

import models.components.Component;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FooterMenuFollowUs extends Component {

    private final By columnSel = By.cssSelector("div.footer > div.footer-menu-wrapper > div.column.follow-us > h3");
    private final By itemsSel = By.cssSelector("div.footer-menu-wrapper > div.column.follow-us > ul > li > a");

    public WebElement followUsColumnTitle() {
        return this.driver.findElement(columnSel);
    }

    public List<WebElement> followUsItems() {
        return this.driver.findElements(itemsSel);
    }

    public FooterMenuFollowUs(WebDriver driver) {
        super(driver);
    }
}
