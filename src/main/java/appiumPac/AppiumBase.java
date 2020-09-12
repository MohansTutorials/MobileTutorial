package appiumPac;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumBase {
	
	public static AndroidDriver<MobileElement> Appiumcapabilities() throws MalformedURLException {
		
		DesiredCapabilities DC=new DesiredCapabilities();
		DC.setCapability(MobileCapabilityType.DEVICE_NAME, "AppiumEmulatorOreo");
		DC.setCapability(MobileCapabilityType.APP, "D:\\ApexAppium\\SampleAPK\\SampleAndroidAppTwo.apk");
		//DC.setCapability(MobileCapabilityType.APP, "D:\\ApexAppium\\SampleAPK\\ApiDemos-debug.apk");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<MobileElement> androidDriver = new AndroidDriver<MobileElement>(url, DC);
		return androidDriver;
		
	}

}
