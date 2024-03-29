package com.zerobank.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(  features = "src/test/resources/features",
        glue = "com/zerobank/stepdefinitions",
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports"},
        dryRun =true,
  tags = "@AccountSummary"
)
public class CukesRunner {


}
