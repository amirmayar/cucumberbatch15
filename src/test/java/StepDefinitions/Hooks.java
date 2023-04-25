package StepDefinitions;

import Utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.io.IOException;

public class Hooks extends CommonMethods {
    @Before
    public void preConditions() {
        openBrowserAndLaunchApplication();
    }

    // Scenario class holds the complete information of you test execution in cucumber framework

    @After
    public void postConditions(Scenario scenario) throws IOException {
     byte [] pic;
     if(scenario.isFailed())
     {
         pic= takeScreenshot("failed/"+scenario.getName());
     }else {
         pic = takeScreenshot("passed/"+ scenario.getName());
     }
     // attach the screenshot in my reaport
        scenario.attach(pic,"image/png",scenario.getName());

        closeBrowser();
    }

}
