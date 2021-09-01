package models.components;

import org.openqa.selenium.WebDriver;

public class Component {
    protected final WebDriver driver;

    public Component(WebDriver driver) {
        this.driver = driver;
    }
}
