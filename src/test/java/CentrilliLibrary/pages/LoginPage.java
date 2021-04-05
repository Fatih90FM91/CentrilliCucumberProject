package CentrilliLibrary.pages;

import CentrilliLibrary.utilities.Driver;
import org.junit.runner.manipulation.Ordering;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    public LoginPage() {
        PageFactory.initElements(Driver.get(),this);
    }


    @FindBy(id="login")
    public WebElement userName;



    @FindBy(id="password")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"wrapwrap\"]/main/div/form/div[3]/button")
    public WebElement submit;


    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement userNameOnPage;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();

    }

}
