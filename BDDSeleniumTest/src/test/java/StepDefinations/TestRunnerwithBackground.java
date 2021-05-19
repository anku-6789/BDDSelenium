package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resources/BackgroundBDD/Backgroundfeature.feature",glue={"StepDefinationForBackground"}
,monochrome=true,
//it will create html report
plugin={"pretty","html:target/HtmlReports",	
   "json:target/jsonReports/report.json"
 ,"junit:target/junitReports/report.xml"}
 )
//@mustrun  above feature it will execute all the f
//for tages we can usr and or or skip particular
public class TestRunnerwithBackground {

}

