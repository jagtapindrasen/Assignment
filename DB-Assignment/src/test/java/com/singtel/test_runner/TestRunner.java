package com.singtel.test_runner;

import org.junit.runner.RunWith;   
import cucumber.api.CucumberOptions;

//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.junit.Cucumber;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\com\\singtel\\features\\",
		glue = "com.singtel.step_defs",
		plugin = {"pretty", "html:test-output", "json:target/json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		monochrome = true,
		tags="",
		strict = true,
		dryRun = false
		)
public class TestRunner {

}
