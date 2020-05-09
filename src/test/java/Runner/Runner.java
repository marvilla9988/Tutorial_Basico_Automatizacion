package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "DefSteps",
        //plugin = {"pretty","html:target/cucumber-reports"}, //reporte sencillo
        //  plugin = {"com.cucumber.listener.ExtentCucumber:target/cucumber-reports/report.html"}, //reporte de graficos
        // para generar un archivo JSON con todos lo necesario para modelar nuestro HTML
        //plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-reports.json"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-report.json"},
        monochrome = true,
        tags = "@Test"
)
public class Runner {
}
