package com.panasonic.payment;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( 
features="src/main/resources", 
plugin={"html:out"})
public class RunnerDriver {

	
	
}
