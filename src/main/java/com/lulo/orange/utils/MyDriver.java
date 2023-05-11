package com.lulo.orange.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyDriver {
    private  ChromeDriver chromeDriver;

    public MyDriver(ChromeDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    public static MyDriver web(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.addArguments("--incognito");
        ChromeDriver chromeDriver = new ChromeDriver(chromeOptions);
        return new MyDriver(chromeDriver);
    }

    public WebDriver enLaPagina(String url){
        this.chromeDriver.get(url);
        return this.chromeDriver;
    }
}
