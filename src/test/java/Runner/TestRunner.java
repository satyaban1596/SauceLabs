package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/feature",glue={"stepDefination","helper"},tags="@Reg",
plugin="html:target/testReport/Test.html")
public class TestRunner {

} 
