package CentrilliLibrary.step_definitions;

import CentrilliLibrary.pages.DashBoardPage;
import CentrilliLibrary.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.*;
import java.util.Collections;
import java.util.List;

public class DashBoardStepDefs {

   DashBoardPage dashBoardPage=new DashBoardPage();


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
}
