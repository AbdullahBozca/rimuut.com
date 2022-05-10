package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CalculatingPage {
    public CalculatingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "currency")
    public WebElement currencyDropDown;

    @FindBy(id = "headingExpenses")
    public WebElement expenses;

    @FindBy(id = "expense_0")
    public WebElement monthltRent;

    @FindBy(id = "headingOthers")
    public WebElement others;

    @FindBy(id = "taxation")
    public WebElement taxrate;

    @FindBy(id = "result")
    public WebElement result;
}
