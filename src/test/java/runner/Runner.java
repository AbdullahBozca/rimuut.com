package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(


        plugin = {"html:target/default-cucumber-reports.html",
                "pretty",
                "rerun:target/failedRerun.txt",
                "junit:target/xml-report/cucumber.xml"
        },
        features = "src/test/resources/features",
        glue = {"stepdefinitions", "hooks"},


        tags = "@Q1",




        dryRun = true
)
public class Runner {
}
