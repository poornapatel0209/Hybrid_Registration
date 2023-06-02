package StepDefinitions;

import ResultVerification.ResultVerificationForRegisterPage;
import WebElements.RegisterPage;
import cucumber.api.java.en.When;

public class Register {
    RegisterPage registerPage = new RegisterPage();
    ResultVerificationForRegisterPage resultVerificationForRegisterPage = new ResultVerificationForRegisterPage();
   // ResultVerificationForHomePage resultVerificationForHomePage = new ResultVerificationForHomePage();

    @When("^User click on Register Link$")
    public void user_click_on_Register_Link()  {
    registerPage.clickOnRegisterLink();
    }

    @When("^User is one Register page and verify Register page Title$")
    public void user_is_one_Register_page_and_verify_Register_page_Title()  {
    resultVerificationForRegisterPage.registerPageTitle();
    }

    @When("^User enter Firstname and Lastname and Email and Password and ConfirmPassword and  click on Register button$")
    public void user_enter_Firstname_and_Lastname_and_Email_and_Password_and_ConfirmPassword_and_click_on_Register_button() {
        registerPage.doRegister();

    }



}
