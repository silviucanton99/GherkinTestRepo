package hellocucumber;

import com.hpe.alm.octane.OctaneGherkinFormatter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin="com.hpe.alm.octane.OctaneGherkinFormatter:target/cucumber-reports/Cucumber.xml")
public class RunCucumberTest {
}
