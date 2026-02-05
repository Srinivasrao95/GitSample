package runner;		

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(features="cucumber_bdd",glue={"stepDefenitions"})						
public class Runner 				
{		

}