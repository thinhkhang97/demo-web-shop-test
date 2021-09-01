package models.pages;

import org.openqa.selenium.WebDriver;

public class Page {
    protected final String url;

    protected final WebDriver driver;

    public Page(String url, WebDriver driver) {
        this.url = url;
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
