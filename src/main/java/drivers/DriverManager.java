package drivers;
import java.util.concurrent.TimeUnit;

import common.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverManager {

    private static ThreadLocal<WebDriver> drivers = new ThreadLocal<>();
    /***
     * Start browser to init driver
     * @param type : Type of DriverType
     */
    public static void startBrowser(DriverType type) {
        switch (type) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                drivers.set(new ChromeDriver());
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                drivers.set(new FirefoxDriver());
                break;
            default:
                WebDriverManager.iedriver().setup();
                drivers.set(new InternetExplorerDriver());
                break;
        }

        drivers.get().manage().window().maximize();
        drivers.get().manage().timeouts().implicitlyWait(Constants.TIME_OUT_SHORT, TimeUnit.SECONDS);
    }

    /***
     * Navigate to base URL
     */
    public static void navigateToUrl(String url) {
        drivers.get().get(url);
    }

    /***
     * Quit driver
     */
    public static void quitWebDriver() {
        if (null != drivers) {
            drivers.get().quit();
        }
    }

    /***
     * Close driver
     */
    public static void closeWebDriver() {
        if (drivers != null) {
            drivers.get().close();
        }
    }

    /***
     * Get driver from outside
     * @return : drivers
     */
    public static WebDriver getWebDriver() {
        return drivers.get();
    }

    /***
     * JavascriptExecutor
     * @return
     */
    public static JavascriptExecutor initJs() {
        return (JavascriptExecutor) drivers.get();
    }

    /***
     * Scroll till end of the page
     *
     */
    public static void scrollToPageView() {
        initJs().executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    // Accepting javascript alert
    public static void alertAccept() {
        Alert alert = drivers.get().switchTo().alert();
        alert.accept();
    }
}
