package com.example.CucumberSelenium.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/example/CucumberSelenium/resources/features", glue = "com.example.CucumberSelenium.stepdefs")
public class CucumberTestRunnerTests {
}
