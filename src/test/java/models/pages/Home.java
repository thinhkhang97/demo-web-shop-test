package models.pages;

import models.components.global.PageFooter;
import models.components.global.PageHeader;
import org.openqa.selenium.WebDriver;

public class Home extends Page {

    public Home(String url, WebDriver driver) {
        super(url, driver);
    }

    public PageHeader pageHeader() {
        return new PageHeader(this.driver);
    }

    public PageFooter pageFooter() {
        return new PageFooter(this.driver);
    }
}
