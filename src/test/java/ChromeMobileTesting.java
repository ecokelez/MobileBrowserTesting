import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ChromeMobileTesting {

    @Test
    public void chromeTesting() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("platformVersion","10.0");
        caps.setCapability("deviceName","Pixel 4");
        caps.setCapability("appPackage","/system/product/app/Chrome/Chrome.apk");
        caps.setCapability("appActivity","com.google.android.apps.chrome.Main");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"),caps);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
}
