package com.sanangel.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "@AgregarCarrito",
        glue = "com.sanangel.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class AgregarProductosRunner {
}
