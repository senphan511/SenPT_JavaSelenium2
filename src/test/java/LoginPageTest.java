import cucumber.api.CucumberOptions;
import driver.DriverManager;
import driver.DriverManagerFactory;
import driver.DriverType;
import pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@CucumberOptions = (features = {""},
        plugin = {""})
public class LoginPageTest extends TestNGCucumberTests{
  /*  DriverManager driverManager;
    WebDriver driver;
    LoginPage loginPage;*/

    LoginPage loginPage = new LoginPage();

    @BeforeClass(alwaysRun = true)
    public void setup() {
        loginPage.open();
        loginPage.login(user.getUserName(), user.getPassword());
    }

}