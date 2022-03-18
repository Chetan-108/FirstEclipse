package com.runner1;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
features="src/main/java/com/features1",
		
glue="com.stepdefs1",
		
dryRun=false,// it is used to compile/execute feature file
		
monochrome=true,// change output in readable language

tags={"@jbk"},//only scenario with @jbk run
//tags={"@jbk,@jbk1"} //only scenario with @jbk & jbk1 run
//tags={"~@jbk"}//only scenario with @jbk  not run
plugin= {"html:target"}// used for report generation
		
)

public class TestRunner1 {

}
