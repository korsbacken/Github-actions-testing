package com.example.CucumberSelenium.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StepDefinitions2 {

    private WebDriver driver; // Define WebDriver instance

    public StepDefinitions2() {
        this.driver = Hooks.getDriver();
    }

    @When("User enter search term")
    public void user_enter_search_term() {
        driver.get("https://webshop-agil-testautomatiserare.netlify.app/checkout");

    }

    @When("click on search")
    public void click_on_search() {
        driver.findElement(By.id("debit")).click();
    }

    @Then("search result should be this")
    public void search_result_should_be_this() {
        Assertions.assertTrue(driver.findElement(By.id("debit")).isSelected());
    }
}