package models.components.global;

import models.components.Component;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.List;

public class HeaderLinks extends Component {

    private final HashMap<String, By> linkSelMap = new HashMap<>();

    private final By registerSel = By.cssSelector("div.header-links > ul > li:nth-child(1) > a");
    private final By loginSel = By.cssSelector("div.header-links > ul > li:nth-child(2) > a");
    private final By shoppingCartSel = By.cssSelector("div.header-links > ul > li:nth-child(3) > a");
    private final By wishListSel = By.cssSelector("div.header-links > ul > li:nth-child(4) > a");

    public HeaderLinks(WebDriver driver) {
        super(driver);
        this.linkSelMap.put("register", registerSel);
        this.linkSelMap.put("login", loginSel);
        this.linkSelMap.put("shoppingCart", shoppingCartSel);
        this.linkSelMap.put("wishList", wishListSel);
    }

    /**
     * Get header link item by name
     * The name should be "register", "login", "shoppingCart", "wishList"
     *
     * @param name name of header item
     * @return Web element
     */
    public WebElement getHeaderLink(String name) {
        return driver.findElement(this.linkSelMap.get(name));
    }
}
