package models.components.global;

import models.components.Component;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderSearchBar extends Component {

    final private By inputSel = By.cssSelector("#small-searchterms");

    final private By searchBtnSel = By.cssSelector("div.header > div.search-box > form > input.button-1.search-box-button");

    public HeaderSearchBar(WebDriver driver) {
        super(driver);
    }

    public WebElement input() {
        return this.driver.findElement(inputSel);
    }

    public WebElement searchButton() {
        return this.driver.findElement(searchBtnSel);
    }
}
