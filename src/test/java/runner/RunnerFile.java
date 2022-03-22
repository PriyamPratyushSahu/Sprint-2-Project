package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature_Files",glue= {"stepDefinitions"},
monochrome = true,
plugin = {"pretty","html:target/Html_Report/HtmlReports.html",
		"json:target/Json_Report/cucumber.json",
		"pretty:target/Text_report/cucumber-pretty.txt",
		"usage:target/Json_Report2/cucumber-usage.json", 
		"junit:target/Xml_Report/cucumber-results.xml"})


public class RunnerFile {
	

}
