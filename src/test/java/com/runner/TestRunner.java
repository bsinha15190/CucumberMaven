package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(strict=true,dryRun=true,plugin= {"pretty","junit:src\\test\\resources\\Reports\\output.xml"},monochrome=true,features="src\\test\\resources\\Feature",glue= {"com.stepDefn"})
public class TestRunner {

}
//snippets=SnippetType.CAMELCASE,