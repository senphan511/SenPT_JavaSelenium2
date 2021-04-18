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
        Given("I navigate to Railway", () -> {
            DriverManager.navigateToUrl(Constants.RAILWAY_URL);
        });

        When("I'm in Login Page", () -> {
                generalPage.getTablLogin();
        });

        When("I get logged in with account from {string} with {string}",(String username, String password) -> {
            LoginPage.login(username, password);
        });

        Then("System should display a label as {string}", (String text) -> {
            Assert.assertEquals(generalPage.getlblWelcomeMessage(),text,"Login failed");
        });

        Then("System should display page header as {string}", (String header) -> {
            Assert.assertEquals(generalPage.getHeaderPage(),header,"Can not get page header");
        });
    }
}
