package ResultVerification;

import BasePage.Utils;
import org.testng.Assert;

public class ResultVerificationForRegisterPage extends Utils {

    public void registerPageTitle(){
        String RegisterPageTitle = driver.getTitle();
        Assert.assertEquals(RegisterPageTitle,"nopCommerce demo store. Register","Page title not match");
    }
}
