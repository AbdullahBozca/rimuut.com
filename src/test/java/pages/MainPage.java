package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPage {

    public MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //@FindBy (xpath = "//img[@class='img-fluid radius10 radius24']")
    //public WebElement firstImg;

    @FindBy(css = ".img-fluid.radius10.radius24")
    public WebElement firstImg;

    @FindBy(xpath = "//div[@class='cookieControl__BarButtons']")
    public WebElement cookieControlBarButtons;
}
