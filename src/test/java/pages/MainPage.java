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

    @FindBy(xpath = "//div[@class='row align-items-center justify-content-center']")
    public  WebElement secondImg;

    @FindBy (xpath = "(//img[@class='img-fluid radius10'])[1]")
    public WebElement thirdImg;

    @FindBy(xpath = "(//img[@class='img-fluid radius10'])[2]")
    public WebElement fourthImg;

    @FindBy (xpath = "(//img[@class='img-fluid radius10'])[3]")
    public WebElement fifthImg;

    @FindBy(xpath = "(//img[@class='img-fluid radius10'])[4]")
    public WebElement sixthImg;

    @FindBy(css = ".radius10.w-full.radius32.aos-init.aos-animate")
    public WebElement seventhImg;

    @FindBy(xpath = "(//img[@class='mb-25 mb-md-0 img-fluid radius10'])[1]")
    public WebElement eighthImg;

    @FindBy(xpath = "(//img[@class='mb-25 mb-md-0 img-fluid radius10'])[1]")
    public WebElement ninthImg;
}
