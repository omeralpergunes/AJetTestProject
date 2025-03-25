package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json",
                "junit:target/cucumber-reports/cucumber.xml"
        },
        features = "src/test/resources/features",
        glue = {"stepdefinitions", "hooks"},
        tags = "@Flight", // Örnek: yalnızca @smokeTest tag'ine sahip senaryoları çalıştırır
        dryRun = false, // Gerçekten testleri çalıştırır
        monochrome = true // Konsol çıktısının daha temiz olmasını sağlar
)
public class TestRunner {
}
