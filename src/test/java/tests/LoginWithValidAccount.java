package tests;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/features/login_with_valid_username_password.feature"},
        glue = {"java.definitions"},
        plugin = {

        }
)
public class LoginWithValidAccount {
}
