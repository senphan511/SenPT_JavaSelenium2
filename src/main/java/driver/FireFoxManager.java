package driver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FireFoxManager extends DriverManager {
    @Override
    public void createWebDriver() {
        FirefoxOptions options = new FirefoxOptions();
        this.driver = new FirefoxDriver(options);
    }
}

