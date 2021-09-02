package models.components.global;

import models.components.Component;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FooterMenuInformation extends Component {

    private final By columnSel = By.cssSelector("div.footer > div.footer-menu-wrapper > div.column.information > h3");
    private final By itemsSel = By.cssSelector("div.footer-menu-wrapper > div.column.information > ul > li > a");

    public WebElement informationColumnTitle() {
        return this.driver.findElement(columnSel);
    }

    public List<WebElement> informationItems() {
        return this.driver.findElements(itemsSel);
    }

    public FooterMenuInformation(WebDriver driver) {
        super(driver);
    }
}
