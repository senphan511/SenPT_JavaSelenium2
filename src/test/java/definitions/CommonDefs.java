package definitions;

import io.cucumber.java8.En;
import pages.HomePage;

public class CommonDefs implements En {
    HomePage homePage = new HomePage();

    public CommonDefs(){
        Given("I am navigating to RailWay website",{

        });

        When("I click on {String} tab"), (String page) ->{
        });

        When("I enter username and password", {
        })
    }
}
