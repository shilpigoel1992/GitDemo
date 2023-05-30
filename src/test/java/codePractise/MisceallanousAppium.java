package codePractise;


import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class MisceallanousAppium extends BaseTest{



    @Test
    public void MisceallanousAppiumTest() throws MalformedURLException {


        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
        driver.findElement(By.id("android:id/checkbox")).click();

        DeviceRotation landscape = new DeviceRotation(0,0,90);
        driver.rotate(landscape);

        driver.setClipboardText("Rahul Wifi");
        driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());

//        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
//        String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
//        Assert.assertEquals(alertTitle,"WiFi settings");
//        driver.findElement(By.id("android:id/edit")).sendKeys("Shilpi wifi");
//        driver.findElements(By.className("android.widget.Button")).get(1).click();


    }

}
