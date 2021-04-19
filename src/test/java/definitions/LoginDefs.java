package definitions;

import io.cucumber.java8.En;
import pages.LoginPage;

public class LoginDefs implements En {
    LoginPage loginPage = new LoginPage();
    public LoginDefs(){
        When("^I click on hyperlink \"([^\"]*)\"$", (String link) -> {
            loginPage.getHyperlink();
        });
    }
}
