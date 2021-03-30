package java;

import driver.DriverManager;
import driver.DriverManagerFactory;
import driver.DriverType;
import objects.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginPageTests {
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
        assertEquals(loginPage.getLoginErrorMessage(), "");
    }
}
