package CentrilliLibrary.step_definitions;

import CentrilliLibrary.pages.LoginPage;
import CentrilliLibrary.utilities.BrowserUtils;
import CentrilliLibrary.utilities.ConfigurationReader;
import CentrilliLibrary.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefs {

    LoginPage loginPage=new LoginPage();

    @Given("the user is on the  webpage")
    public void the_user_is_on_the_webpage() {
         String url = ConfigurationReader.get("url");
         Driver.get().get(url);


    }



    @Then("the user enters the manufuser information")
    public void theUserEntersTheManufuserInformation() {

        String username = ConfigurationReader.get("manufacturing_User_username");
        String password = ConfigurationReader.get("manufacturing_User_password");
        loginPage.login(username,password);
    }



    @Then("the user should be able to login as a {string}")
    public void theUserShouldBeAbleToLoginAsA(String name) {
        BrowserUtils.waitFor(4);

        String expectedUserName= loginPage.userNameOnPage.getText();

        Assert.assertEquals(expectedUserName,name);
    }

    @Then("the user should be able to write {string}")
    public void theUserShouldBeAbleToWrite(String username) {

        loginPage.userName.sendKeys(username);
    }

    @Then("the user should be able to write  the {string}")
    public void theUserShouldBeAbleToWriteThe(String password) {
        loginPage.password.sendKeys(password);
    }

    @And("the user should be able to enter the button")
    public void theUserShouldBeAbleToEnterTheButton() {

        loginPage.submit.click();
    }

    @And("the user should be able to verify on the page")
    public void theUserShouldBeAbleToVerifyOnThePage() {

         BrowserUtils.waitFor(4);
        String expectedUserName=loginPage.userNameOnPage.getText();
        String actualUserName="POSManager10";

        Assert.assertEquals(expectedUserName,actualUserName);


    }
}
