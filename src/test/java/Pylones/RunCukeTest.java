package Pylones;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Chirag\\IdeaProjects\\Pylones\\src\\test\\Resource\\SignIn.feature",tags = {"@regression"},
plugin = {"html:target/Cucumber-html-report",
          "json:target/cucumber-report.json",
          "junit:traget/cucumber-xml-report.xml"}
)





public class RunCukeTest {
}
