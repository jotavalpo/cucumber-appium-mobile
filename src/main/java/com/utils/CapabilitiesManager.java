package com.utils;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.IOException;

public class CapabilitiesManager {

    public DesiredCapabilities getCaps() throws IOException {
   
        try{
        DesiredCapabilities capabilities = new DesiredCapabilities();    
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "12");
        capabilities.setCapability("appPackage", "com.airbnb.android");
        capabilities.setCapability("appActivity", "com.airbnb.android.feat.homescreen.HomeActivity");
     
        return capabilities;

        } catch(Exception e){
            e.printStackTrace();
            throw e;
        }
    }
    
}
