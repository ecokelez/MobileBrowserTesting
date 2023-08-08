import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileBrowserTesting {


    @Test
    public void MobileBrowserTesting() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("platformVersion","10.0");
        caps.setCapability("deviceName","Pixel 4");
        caps.setCapability("browserName","chrome");
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"60000");
        caps.setCapability("chromedriverExecutable","C:\\Users\\LENOVO\\IdeaProjects\\MobileBrowserTesting\\src\\driver\\chromedriver.exe");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"),caps);


        driver.get("https://www.amazon.com.tr");
        MobileElement logo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
        Assert.assertTrue(logo.isDisplayed());
        System.out.println("The homepage has been reached.");

        // Dikkat sorulacak ve arastirilacak asagidaki kod blogu !!!..
        // MobileElement mrbGrsButton = driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']"));
        //Actions actions = new Actions(driver);
        // actions.moveToElement(mrbGrsButton);

        MobileElement girisButton = driver.findElement(By.xpath("//*[@class='nav-action-inner']"));
        girisButton.click();
    }

}
