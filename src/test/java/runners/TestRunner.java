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
        tags = "@Additional", // Örnek: yalnızca @smokeTest tag'ine sahip senaryoları çalıştırıyoruz
        dryRun = false, // Gerçekten testleri çalıştırıyoruz
        monochrome = true // Konsol çıktısının daha temiz olmasını sağlıyoruz.
)
public class TestRunner {
}
