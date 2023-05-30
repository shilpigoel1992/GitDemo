package codePractise;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
public AndroidDriver driver;
    @BeforeClass
    public void ConfigureAppium() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("9B301FFAZ0010K");
        options.setApp("//Users//s0g0bgm//IdeaProjects//AppAuto//src//test//java//resources//ApiDemos-debug.apk");
         driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),options);
    }

    public void LongPressGesture(WebElement ele){
        ((JavascriptExecutor)driver).
                executeScript("mobile: longClickGesture",
                        ImmutableMap.of("elementId", ((RemoteWebElement)ele).getId(),"duration",2000));
    }

    public void scrollGestureAction(){
        boolean canScrollMore=false;
        do {
            canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 200, "height", 200,
                    "direction", "down",
                    "percent", 3.0
            ));
        }while(canScrollMore);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
