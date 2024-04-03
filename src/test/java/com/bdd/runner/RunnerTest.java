package com.bdd.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:cucumber.json"},
        features = {"src/test/resources/features/"},
        glue = "com.bdd.stepDefinitions",
        tags = "@BuscarHotel"
)
public class RunnerTest {
}
