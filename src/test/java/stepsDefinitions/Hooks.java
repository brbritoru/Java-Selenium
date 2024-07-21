package stepsDefinitions;

import core.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks extends DriverFactory {

    @Before
    public void iniciaDriver() {
        instanciaDriver();
        pegaDriver().get("https://www.floresonline.com.br");
    }

    @After
    public void limpaDriver() {
        pegaDriver().quit();
    }

    public void takeScreenshot(Scenario scenario) {
        byte[] screenshot = ((TakesScreenshot) pegaDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName());
    }
}
