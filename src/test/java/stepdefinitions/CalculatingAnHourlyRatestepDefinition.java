package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.CalculatingPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class CalculatingAnHourlyRatestepDefinition {
    CalculatingPage cp=new CalculatingPage();
    Select select;
    Actions actions;
    @Then("Currency choose")
    public void currencyChoose() {
        select=new Select(cp.currencyDropDown);
        select.selectByValue("TRY");
    }

    @And("expenses filling")
    public void expensesFilling() {
        Driver.waitAndClick(cp.expenses);
        actions=new Actions(Driver.getDriver());
        actions.click(cp.monthltRent).sendKeys("3000").sendKeys(Keys.TAB).
                sendKeys("3000").sendKeys(Keys.TAB).
                sendKeys("3000").sendKeys(Keys.TAB).
                sendKeys("3000").sendKeys(Keys.TAB).
                sendKeys("3000").sendKeys(Keys.TAB).
                sendKeys("3000").sendKeys(Keys.TAB).
                sendKeys("3000").sendKeys(Keys.TAB).
                sendKeys("3000").sendKeys(Keys.TAB).
                sendKeys("3000").sendKeys(Keys.TAB).
                sendKeys("3000").sendKeys(Keys.TAB).
                sendKeys("3000").sendKeys(Keys.TAB).
                sendKeys("3000").sendKeys(Keys.TAB).
                sendKeys("3000").sendKeys(Keys.TAB).
                sendKeys("3000").sendKeys(Keys.TAB).
                perform();
    }

    @And("others filling")
    public void othersFilling() {
        Driver.waitAndClick(cp.others);
        actions=new Actions(Driver.getDriver());
        actions.click(cp.taxrate).
                sendKeys("10").sendKeys(Keys.TAB).
                sendKeys("10").sendKeys(Keys.TAB).
                sendKeys("40").sendKeys(Keys.TAB).
                sendKeys("8").sendKeys(Keys.TAB).
                sendKeys("2").sendKeys(Keys.TAB).
                sendKeys("3").sendKeys(Keys.TAB).
                perform();
    }

    @Then("result check")
    public void resultCheck() throws IOException {
        Assert.assertTrue(cp.result.isDisplayed());
        ReusableMethods.waitFor(1);
        ReusableMethods.getScreenshot("result");
    }
}
