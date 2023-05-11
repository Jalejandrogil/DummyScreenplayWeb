package com.lulo.orange.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(features = "src/test/resources/login_orange.feature",
snippets = CucumberOptions.SnippetType.CAMELCASE,
glue = "com.lulo.orange.definitions")
public class OrangeRunner {
}
