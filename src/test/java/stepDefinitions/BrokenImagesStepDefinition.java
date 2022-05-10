package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.MainPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class BrokenImagesStepDefinition {
    MainPage mp=new MainPage();

    @Given("images control")
    public void images_control() {
        assertTrue(mp.firstImg.isDisplayed());
    }

    @Given("{string} gider")
    public void gider(String url) {
        Driver.getDriver().get(ConfigurationReader.getProperty(url));
        mp.cookieControlBarButtons.click();
    }
}
