package com.digitalnomads.utils.drivers;

import com.digitalnomads.configs.ConfigReader;
import org.openqa.selenium.WebDriver;

public class Driver {

    private Driver() {
        // Singleton pattern
    }

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null) {
            switch (ConfigReader.getProperty("browser").toLowerCase()) {
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;

                default:
                    throw new RuntimeException("You provided wrong browser name");
            }
        }
        return driver;
    }


    public static void closeDriver(){
        try {
            if (driver != null){
                driver.close();
                driver.quit();
                driver = null;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}