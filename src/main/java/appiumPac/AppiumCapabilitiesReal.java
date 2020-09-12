package appiumPac;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumCapabilitiesReal {
	
	
	public static AndroidDriver<MobileElement> Capabilitiesreal() throws MalformedURLException {
		
		DesiredCapabilities DRC=new DesiredCapabilities();
		DRC.setCapability(MobileCapabilityType.UDID, "RZ8M9188ZYE");
		DRC.setCapability(MobileCapabilityType.DEVICE_NAME, "SamsungM30S");
		DRC.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		DRC.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		DRC.setCapability(MobileCapabilityType.NO_RESET, true);
		DRC.setCapability("appPackage", "com.whatsapp");
		DRC.setCapability("appActivity", "com.whatsapp.Main");
		DRC.setCapability("chromedriverExecutable", "D:\\AppiumDrivers\\chromedriver.exe");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<MobileElement> androidDriver = new AndroidDriver<MobileElement>(url, DRC);
		return androidDriver;
		
	}

}
