package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MainPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;
import java.io.IOException;
import static org.junit.Assert.assertTrue;

public class BrokenImagesStepDefinition {
    MainPage mp=new MainPage();
    Actions actions;

    @Given("images control")
    public void images_control() throws IOException {
        assertTrue(mp.firstImg.isDisplayed());
        ReusableMethods.getScreenshot("birinci");

        Driver.clickWithJS(mp.secondImg);
        assertTrue(mp.secondImg.isDisplayed());
        ReusableMethods.getScreenshot("ikinci");


        Driver.clickWithJS(mp.thirdImg);
        ReusableMethods.waitFor(1);
        assertTrue(mp.thirdImg.isDisplayed());
        ReusableMethods.getScreenshot("ucuncu");


        Driver.clickWithJS(mp.fourthImg);
        ReusableMethods.waitFor(1);
        assertTrue(mp.fourthImg.isDisplayed());
        ReusableMethods.getScreenshot("dorduncu");


        Driver.clickWithJS(mp.fifthImg);
        ReusableMethods.waitFor(1);
        assertTrue(mp.fifthImg.isDisplayed());
        ReusableMethods.getScreenshot("besinci");


        Driver.clickWithJS(mp.sixthImg);
        ReusableMethods.waitFor(1);
        assertTrue(mp.sixthImg.isDisplayed());
        ReusableMethods.getScreenshot("altinci");


        actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        assertTrue(mp.seventhImg.isDisplayed());
        ReusableMethods.getScreenshot("yedinci");


        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        assertTrue(mp.eighthImg.isDisplayed());
        ReusableMethods.getScreenshot("sekizinci");

        ReusableMethods.waitFor(1);
        assertTrue(mp.ninthImg.isDisplayed());
        ReusableMethods.getScreenshot("dokuzuncu");


    }

    @Given("{string} go to")
    public void gider(String url) {
        Driver.getDriver().get(ConfigurationReader.getProperty(url));
        Driver.waitAndClick(mp.cookieControlBarButtons);
    }

    @And("close page")
    public void closePage() {
        Driver.closeDriver();
    }



}
