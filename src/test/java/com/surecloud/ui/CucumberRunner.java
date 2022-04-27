package com.surecloud.ui;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( plugin = { "pretty" },
    features = { "src/test/resources/features/" },
    glue = { "com.surecloud.ui.steps" } )
class CucumberRunner
    extends AbstractTestNGCucumberTests
{
    @Override
    @DataProvider( parallel = true )
    public Object[][] scenarios()
    {
        return super.scenarios();
    }
}
