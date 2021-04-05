package CentrilliLibrary.pages;

import CentrilliLibrary.utilities.BrowserUtils;
import CentrilliLibrary.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashBoardPage {

    public DashBoardPage() {

        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//li[@style='display: block;']")
    public List<WebElement> dashboardList;


    public List<WebElement> getAllList(String name){

        return Driver.get().findElements(By.xpath("//span[contains(text(),'\""+name+"\')]"));
    }

    public WebElement getBoardHeadByIndex(int index){
        return Driver.get().findElement(By.xpath("//h2["+index+"]"));
    }

    public WebElement getBoardHeadByName(String name){
        return Driver.get().findElement(By.xpath("//span[contains(text(),'"+name+"')]"));
    }








}
