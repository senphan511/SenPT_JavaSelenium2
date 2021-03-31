package definitions;

import io.cucumber.java8.En;
import pages.HomePage;
import pages.LoginPage;

public class CommonDefs implements En {

    public CommonDefs(){
        Given("I'm navigating to {string}", (String url) -> {
            HomePage homePage = new HomePage();

        });
    }
}
