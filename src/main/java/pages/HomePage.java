package pages;

import common.Constants;

public class HomePage {
    public HomePage open(){
        Constants.WEBDRIVER.navigate().to(Constants.RAILWAY_URL);
        return this;
    }
}
