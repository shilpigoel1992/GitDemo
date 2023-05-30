package codePractise;


import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.rmi.Remote;
import java.time.Duration;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.touch.TapOptions.*;
import io.appium.java_client.touch.ActionOptions.*;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class SwipeDemo extends BaseTest{



    @Test
    public void SwipeDemoTest() throws MalformedURLException, InterruptedException {

    driver.findElement(AppiumBy.accessibilityId("Views")).click();

        driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
    driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Photos\"]")).click();
        WebElement ele = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Gallery/android.widget.ImageView[1]"));
        WebElement ele1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Gallery/android.widget.ImageView[3]"));

        Assert.assertEquals(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Gallery/android.widget.ImageView[1]")).getAttribute("focusable"),"true");

        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
               "elemedId", ((RemoteWebElement)ele).getId(),
                "direction", "left",
                "percent", 0.75
        ));






        Assert.assertEquals(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Gallery/android.widget.ImageView[1]")).getAttribute("focusable"),"false");

    }

}
