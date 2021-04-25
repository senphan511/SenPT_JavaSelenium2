package definitions;

import common.Constants;
import drivers.DriverManager;
import io.cucumber.java8.En;
import org.testng.Assert;
import pages.GeneralPage;
import pages.LoginPage;
import pages.RegisterPage;

public class CommonDefs implements En {
            GeneralPage generalPage = new GeneralPage();
            RegisterPage registerPage = new RegisterPage();

    public CommonDefs(){
        Given("I navigate to Railway", () -> {
            DriverManager.navigateToUrl(Constants.RAILWAY_URL);
        });

        When("I'm in Login Page", () -> {
                generalPage.getTablLogin();
        });

        When("I get logged in with account from {string} with {string}", LoginPage::login);

        Then("System should display a label as {string}", (String text) -> {
            Assert.assertEquals(generalPage.getlblWelcomeMessage(),text,"Login failed");
        });

        Then("System should display page header as {string}", (String header) -> {
            Assert.assertEquals(generalPage.getHeaderPage(),header,"Can not get page header");
        });

        When("I click on tab {string}", (String tabName) -> {
                generalPage.clickTab(tabName);
        });

        When("I register with email {string}, password {string}, confirm password {string} and pID {string}", (String email, String password, String confirmPass, String pID) -> {
                registerPage.Register(email,password,confirmPass,pID);
        });

        When("System should display an error message {string}", (String message) -> {
            Assert.assertEquals(registerPage.getErrorMessage(),message,"");
        });
    }
}
