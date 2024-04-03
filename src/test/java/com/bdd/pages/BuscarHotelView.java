package com.bdd.pages;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BuscarHotelView {

    static AndroidDriver androidDriver;

    public static void setAndroidDriver() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "12");
        capabilities.setCapability("appPackage", "com.airbnb.android");
        capabilities.setCapability("appActivity", "com.airbnb.android.feat.homescreen.HomeActivity");
        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void clicBuscador(){
        androidDriver.findElement(By.id("com.airbnb.android:id/start_button")).click();
    }

    public void clicbuscarDestino(){
        androidDriver.findElement(By.className("android.widget.TextView")).click();
    }

    public void escribirDestino(String sDestino){
        Actions actions = new Actions(androidDriver);
        actions.sendKeys(sDestino).perform();
        androidDriver.findElement(By.id("com.airbnb.android:id/title")).click();
    }

}
