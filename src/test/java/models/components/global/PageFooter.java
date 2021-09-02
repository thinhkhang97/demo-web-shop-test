package models.components.global;

import models.components.Component;
import org.openqa.selenium.WebDriver;

public class PageFooter extends Component {

    public FooterMenuInformation footerMenuInformation() {
        return new FooterMenuInformation(this.driver);
    }

    public FooterMenuCustomerService footerMenuCustomerService() {
        return new FooterMenuCustomerService(this.driver);
    }

    public FooterMenuMyAccount footerMenuMyAccount() {
        return new FooterMenuMyAccount(this.driver);
    }

    public FooterMenuFollowUs footerMenuFollowUs() {
        return new FooterMenuFollowUs(this.driver);
    }

    public PageFooter(WebDriver driver) {
        super(driver);
    }
}
