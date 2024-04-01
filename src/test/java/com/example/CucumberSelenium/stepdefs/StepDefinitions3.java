package com.example.CucumberSelenium.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class StepDefinitions3 {

    private final WebDriver driver; // Define WebDriver instance
    public Actions actions;

    public StepDefinitions3() {
        this.driver = Hooks.getDriver();
    }

    @Given("User has navigated to the shop page")
    public void user_has_navigated_to_the_shop_page() {
        driver.get("https://webshop-agil-testautomatiserare.netlify.app/products");
    }

    @Given("user clicks on add to cart button")
    public void user_clicks_on_add_to_cart_button() {
        WebElement element = driver.findElement(By.xpath("//h3[text()='Rain Jacket Women Windbreaker Striped Climbing Raincoats']/following-sibling::button"));
        actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

        element.click();

    }

    @When("user navigates to the checkout page")
    public void user_navigates_to_the_checkout_page() {
        driver.get("https://webshop-agil-testautomatiserare.netlify.app/checkout");
    }

    @Then("user should see the added product in the cart")
    public void user_should_see_the_added_product_in_the_cart() {
        Assertions.assertEquals("Rain Jacket Women Windbreaker Striped Climbing Raincoats", driver.findElement(By.xpath("//div[@class='w-100']/h6")).getText());
    }
}