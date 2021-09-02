package pageTest;

import models.pages.Home;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

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

    private void printContentOfWebElementList(List<WebElement> webElements) {
        for (WebElement item : webElements
        ) {
            System.out.println("Content: " + item.getText());
        }
    }

    private void testFooterMenuItems() {
        List<WebElement> informationMenuItems = this.homePage.pageFooter().footerMenuInformation().informationItems();
        System.out.println("Title: " + this.homePage.pageFooter().footerMenuInformation().informationColumnTitle().getText());
        printContentOfWebElementList(informationMenuItems);

        List<WebElement> customerServiceMenuItems = this.homePage.pageFooter().footerMenuCustomerService().customerServiceItems();
        System.out.println("Title: " + this.homePage.pageFooter().footerMenuCustomerService().customerServiceColumnTitle().getText());
        printContentOfWebElementList(customerServiceMenuItems);

        List<WebElement> myAccountMenuItems = this.homePage.pageFooter().footerMenuMyAccount().myAccountItems();
        System.out.println("Title: " + this.homePage.pageFooter().footerMenuMyAccount().myAccountColumnTitle().getText());
        printContentOfWebElementList(myAccountMenuItems);

        List<WebElement> followUsMenuItems = this.homePage.pageFooter().footerMenuFollowUs().followUsItems();
        System.out.println("Title: " + this.homePage.pageFooter().footerMenuFollowUs().followUsColumnTitle().getText());
        printContentOfWebElementList(followUsMenuItems);
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

        System.out.println("TEST FOOTER MENU BAR ITEMS");
        this.testFooterMenuItems();
    }


}
