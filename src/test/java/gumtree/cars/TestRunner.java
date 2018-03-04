package gumtree.cars;


import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@cucumber.api.CucumberOptions(
        tags = {"@gumtree"},
        features = {"src/test/resources/gumtree.cars"},
        strict = true,
        glue = {"gumtree.cars.stepDefinitions"},
        format = {"html:cucumber-html-reports"}

)

public class TestRunner {
}
