package appiumPac;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumCapabilitiesBrowser {
	
	public static AndroidDriver<MobileElement> capablitiesBrowser() throws MalformedURLException {
		
		DesiredCapabilities DRC=new DesiredCapabilities();
		DRC.setCapability(MobileCapabilityType.UDID, "RZ8M9188ZYE");
		DRC.setCapability(MobileCapabilityType.DEVICE_NAME, "SamsungM30S");
		DRC.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		DRC.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		
		DRC.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		DRC.setCapability(MobileCapabilityType.BROWSER_VERSION, "84");
		DRC.setCapability("chromedriverExecutable", "D:\\AppiumDrivers\\chromedriver.exe");
		DRC.setCapability(MobileCapabilityType.NO_RESET, true);
		
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.setExperimentalOption("w3c", false);
		DRC.merge(chromeOptions);
		
		AndroidDriver<MobileElement> androidDriver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), DRC);
		return androidDriver;
		
	}

}
