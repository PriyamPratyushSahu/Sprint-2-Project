package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@Test
@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature_Files\\File08_TS_08.feature",glue= {"stepDefinitions"},
monochrome = true,
plugin = {"pretty","html:target/Html_Report/HtmlReports.html",
		"json:target/Json_Report/cucumber.json",
		"pretty:target/Text_report/cucumber-pretty.txt",
		"usage:target/Json_Report2/cucumber-usage.json", 
		"junit:target/Xml_Report/cucumber-results.xml"})


public class RunnerFile2 {
	

}
