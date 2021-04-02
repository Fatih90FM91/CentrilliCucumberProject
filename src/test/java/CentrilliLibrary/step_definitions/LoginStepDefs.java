package CentrilliLibrary.step_definitions;

import CentrilliLibrary.pages.LoginPage;
import CentrilliLibrary.utilities.ConfigurationReader;
import CentrilliLibrary.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefs {

    LoginPage loginPage=new LoginPage();

    @Given("the user is on the  webpage")
    public void the_user_is_on_the_webpage() {
          String url= ConfigurationReader.get("url");
          Driver.get().get(url);
    }



    @Then("the user enters the manufuser information")
    public void theUserEntersTheManufuserInformation() {

        String username = ConfigurationReader.get("manufacturing_User_username");
        String password = ConfigurationReader.get("manufacturing_User_password");
        loginPage.login(username,password);
    }


}
