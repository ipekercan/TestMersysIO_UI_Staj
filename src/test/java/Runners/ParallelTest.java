package Runners;

import Utilities.DriverManager;
import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles"},
        glue={"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class ParallelTest extends AbstractTestNGCucumberTests {
    @BeforeClass
    @Parameters("browser")
    public void beforeClass(String browserName)
    {
        DriverManager.threadBrowserName.set(browserName);
    }

    @AfterClass
    public  static void writeExtentReport(){
        ExtentService.getInstance().setSystemInfo("Test Type", "Parallel Test in All Features");
    }


}