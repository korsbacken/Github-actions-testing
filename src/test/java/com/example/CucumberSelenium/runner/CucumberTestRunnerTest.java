package com.example.CucumberSelenium.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/example/CucumberSelenium/resources/features", glue = "com.example.CucumberSelenium.stepdefs")
public class CucumberTestRunnerTest {
}
