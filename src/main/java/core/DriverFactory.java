package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    static WebDriver driver;

    public ChromeOptions configuraChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1200,900");

        return options;
    }

    public void instanciaDriver(){
        driver = new ChromeDriver(configuraChromeOptions());
    }

    public WebDriver pegaDriver(){
        return driver;
    }

}
