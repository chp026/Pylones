package Pylones;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Chirag\\IdeaProjects\\Pylones\\src\\test\\Resource\\SignIn.feature",tags = {"@regression"},
plugin = {"html:target/cucumber-report"})

public class RunCukeTest {
}
