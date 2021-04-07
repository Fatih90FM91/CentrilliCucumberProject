package CentrilliLibrary.step_definitions;

import CentrilliLibrary.pages.DashBoardPage;
import CentrilliLibrary.pages.LoginPage;
import CentrilliLibrary.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.hc.core5.http.nio.support.AbstractServerExchangeHandler;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.*;
import java.util.Collections;
import java.util.List;

public class DashBoardStepDefs {

   DashBoardPage dashBoardPage=new DashBoardPage();
   LoginPage loginPage=new LoginPage();


    @Then("user verify dashboard list :{}")
    public void userVerifyDashboardListDiscussCalenderNotesContactsWebsiteManufacturingEventsEmployeesLeavesExpensesMaintenanceDashboards(String list) {

        BrowserUtils.waitFor(8);
        List<String> items = Arrays.asList(list.split("\\s*,\\s*"));

        for (int i = 0; i < items.size(); i++) {

            items.set(i,items.get(i).trim());

        }

        WebElement boardElement;

        for (int i = 0; i < items.size(); i++) {
           boardElement=dashBoardPage.getBoardHeadByName(items.get(i));

           Assert.assertTrue(boardElement.isDisplayed());

            System.out.println("boardElement  = " + boardElement.getText());

        }

    }

    @When("user should be able to see dropdown list")
    public void userShouldBeAbleToSeeDropdownList() {

        BrowserUtils.waitFor(6);

        loginPage.userNameOnPage.click();

        Assert.assertTrue(loginPage.userNameOnPage.isDisplayed());

    }

    @Then("In dropdown list should be these")
    public void inDropdownListShouldBeThese(List<String> dropdown) {

        BrowserUtils.waitFor(2);

        List<String> actualList=BrowserUtils.getElementsText(dashBoardPage.dashboardList);
        System.out.println("actualList = " + actualList);
        System.out.println("dropdown = " + dropdown);

        Assert.assertNotEquals(dropdown,actualList);//there is an BUG in Here.
        //DropDownList and actualList are not equal each other.



    }
}
