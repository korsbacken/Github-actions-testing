package com.example.CucumberSelenium.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StepDefinitions {

    private WebDriver driver; // Define WebDriver instance

    public StepDefinitions() {
        this.driver = Hooks.getDriver();
    }

    @Given("User has navigated to the start page")
    public void user_has_navigated_to_the_start_page() {
        driver.get("https://webshop-agil-testautomatiserare.netlify.app/");
    }

    @Then("the page title should be {string}")
    public void the_page_title_should_be_webbutiken(String pageTitle) {
        Assertions.assertEquals(pageTitle, driver.getTitle());
    }

    @When("the user click on the Checkout button")
    public void theUserClickOnTheButton() {
        driver.findElement(By.xpath("//a[contains(@class, 'btn-warning')]")).click();
    }

    @Then("the user should be redirected to the Checkout form page")
    public void theUserShouldBeRedirectedToThePage() {
        Assertions.assertTrue(driver.findElement(By.xpath("//h2[text()='Checkout form']")).isDisplayed(), "Element is not visible");
    }
}
