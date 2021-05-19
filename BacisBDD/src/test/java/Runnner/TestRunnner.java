package Runnner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resources/Features/login.feature",glue={""},monochrome=true,
//it will create html report
//plugin={"pretty","html:target/HtmlReports",	
 //  "json:target/jsonReports/report.json"
// ,"junit:target/junitReports/report.xml"}
plugin = {"json:target/cucumber.json"}) 
public class TestRunnner {

}
