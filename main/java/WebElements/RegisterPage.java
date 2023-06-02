package WebElements;

import BasePage.LoadProperty;
import BasePage.Utils;
import org.openqa.selenium.By;

public class RegisterPage extends Utils {

    LoadProperty loadProperty = new LoadProperty();

    private By _clickOnRegisterLink = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _emailId = By.id("Email");
    private By _passWord = By.id("Password");
    private By _conformPassword = By.id("ConfirmPassword");

    private By _clickOnRegisterButton = By.xpath("//*[@id=\"register-button\"]");

    public void clickOnRegisterLink(){
        doClick(_clickOnRegisterLink);
    }

    public void doRegister(){
        doSendKey(_firstName,loadProperty.getProperty("firstname"));
        doSendKey(_lastName,loadProperty.getProperty("lastname"));
        doSendKey(_emailId,loadProperty.getProperty("email"));
        doSendKey(_passWord,loadProperty.getProperty("password"));
        doSendKey(_conformPassword,loadProperty.getProperty("conformpassword"));
        doClick(_clickOnRegisterButton);
    }
}
