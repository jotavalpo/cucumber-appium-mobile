package com.bdd.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import com.utils.CapabilitiesManager;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BuscarHotelView {

    static AndroidDriver androidDriver;

    public void setAndroidDriver() throws MalformedURLException, IOException {

        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), new CapabilitiesManager().getCaps());
        androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void clicBuscador(){
        androidDriver.findElement(By.id("com.airbnb.android:id/start_button")).click();
    }

    public void clicbuscarDestino(){
        //xpath con index
        androidDriver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.airbnb.android:id/input_bar_input']")).click();
        //xpath con tagname

    
    }

    public void escribirDestino(String sDestino){
        Actions actions = new Actions(androidDriver);
        actions.sendKeys(sDestino).perform();
        androidDriver.findElement(By.id("com.airbnb.android:id/title")).click();
    }

}
