package com.acutest.cdaf.pageobjects.jira;


import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import java.util.List;

public class NavigationBarObject
{
    private static WebDriver webDriver;

    public NavigationBarObject(WebDriver webDriver) {
        NavigationBarObject.webDriver = webDriver;
    }

    private By createButton = By.xpath("//*[contains(@id,'createGlobalItem')]/parent::div");
    private By globalButton = By.id("productLogoGlobalItem");
    private By searchButton = By.id("quickSearchGlobalItem");


    public void create() {

        WebDriverWait wait = new WebDriverWait(webDriver, 15);
        //webDriver.switchTo().parentFrame();
            //webDriver.findElement(createButton).click();




        //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(createButton));
        //webDriver.findElement((createButton)).click();
        //webDriver.findElement((By.id("createGlobaltem"))).click();
    }

    public void navigate(){webDriver.findElement(globalButton).click();}

    public void search() {
        WebDriverWait wait = new WebDriverWait(webDriver, 15);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        webDriver.findElement(searchButton).click();}

}
