package pageTest;

import models.pages.Home;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeTest {

    final private WebDriver driver;

    final private Home homePage;

    public HomeTest(WebDriver driver) {
        this.driver = driver;
        this.homePage = new Home("http://demowebshop.tricentis.com/", driver);
    }

    private void testInputSearchText(String key) {
        this.homePage.pageHeader().getHeaderSearchBar().input().sendKeys(key);
//        this.homePage.pageHeader().getHeaderSearchBar().searchButton().click();
    }

    private void testHeaderLinkHasCorrectHref() {
        WebElement registerItem = this.homePage.pageHeader().headerLinkItem("register");
        System.out.println("href: " + registerItem.getAttribute("href"));

        WebElement loginItem = this.homePage.pageHeader().headerLinkItem("login");
        System.out.println("href: " + loginItem.getAttribute("href"));

        WebElement shoppingCartItem = this.homePage.pageHeader().headerLinkItem("shoppingCart");
        System.out.println("href: " + shoppingCartItem.getAttribute("href"));

        WebElement wishListItem = this.homePage.pageHeader().headerLinkItem("wishList");
        System.out.println("href: " + wishListItem.getAttribute("href"));
    }

    public void start() {
        System.out.println("START TESTING HOME PAGE");

        System.out.println("Open link: " + this.homePage.getUrl());
        this.driver.get(this.homePage.getUrl());

        System.out.println("TEST HEADER LINKS HAVE CORRECT HREF LINKS");
        this.testHeaderLinkHasCorrectHref();

        String key = "Nguyen Thinh Khang";
        System.out.println("TEST SEARCH BAR WITH KEY: " + key);
        this.testInputSearchText(key);
    }


}
