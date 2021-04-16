package drivers;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

    protected static ThreadLocal<WebDriver> drivers = new ThreadLocal<WebDriver>();
    protected abstract WebDriver createDriver();

    public void quitDriver() {
        if (null != drivers.get()) {
            try {
                drivers.get().quit();
                drivers.remove();
            } catch (Exception e) {
//                System.err("Unable to gracefully quit WebDriver.", e); // We'll replace this with actual Loggers later - don't worry !
            }

        }
    }

    public WebDriver getDriver() {
        if (null == drivers.get()) {
            drivers.set(this.createDriver());
        }
        drivers.get().manage().timeouts().implicitlyWait(1L, TimeUnit.SECONDS);

        return drivers.get();
    }

    public static void navigateToUrl(String url) {
        drivers.get().get(url);
    }

    public static void quitWebDriver() {
        if (null != drivers) {
            drivers.get().quit();
        }
    }

}
