package com.example.CucumberSelenium;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GithubActionsTests {

    @Test
    public void test(){
        Assertions.assertTrue(true);
    }
}
