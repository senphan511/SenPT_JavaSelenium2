package definitions;

import common.Constants;
import drivers.DriverManager;
import io.cucumber.java8.En;
import org.testng.Assert;
import pages.GeneralPage;
import pages.LoginPage;

public class CommonDefs implements En {
            GeneralPage generalPage = new GeneralPage();
    public CommonDefs(){
        Given("I'm on login page", () -> {
            DriverManager.navigateToUrl(Constants.RAILWAY_URL);
        });

        When("I get logged in with account from {string} with {string}",(String username, String password) -> {
            LoginPage.login(username, password);
        });

        Then ("System should display Welcome message as {string}", (String text) -> {
            Assert.assertEquals(generalPage.getlblWelcomeMessage(),text,"Login failed");
        });
    }
}
