import driver.DriverManager;
import driver.DriverManagerFactory;
import driver.DriverType;
import objects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTest {
    DriverManager driverManager;
    WebDriver driver;
    LoginPage loginPage;

    @BeforeClass
    public void setUp() {
        driverManager = DriverManagerFactory.getDriverManager((DriverType.CHROME));
        driver.get("");
    }

    @Test
    public void loginTest() {
        loginPage = new LoginPage(driver);
        loginPage.login("", "");
        //assertEquals(loginPage.getLoginErrorMessage(), "");
    }
}