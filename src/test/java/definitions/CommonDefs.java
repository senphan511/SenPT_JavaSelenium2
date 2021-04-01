package definitions;

import io.cucumber.java8.En;
import pages.HomePage;

public class CommonDefs implements En {
    HomePage homePage = new HomePage();

    public CommonDefs(){
        Given("I'm navigating to RailWay website",{
            homePage.open();
        });

        When("I click on {String} tab"), (String page) ->{
        });

        When("I enter username and password", {
        })
    }
}
