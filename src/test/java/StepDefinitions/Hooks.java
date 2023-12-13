package StepDefinitions;

import Utilities.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void init() {

    }

    @After
    public void quit(Scenario scenario) {
        if (scenario.isFailed()){
            TakesScreenshot ts = ((TakesScreenshot) DriverManager.Driver());
            byte[] tmpImg = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(tmpImg, "image/png", scenario.getName());
        }

        //DriverManager.quit();
    }

}
