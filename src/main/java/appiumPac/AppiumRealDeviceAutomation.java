package appiumPac;

import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppiumRealDeviceAutomation extends AppiumCapabilitiesReal{

	public static void main(String[] args) throws MalformedURLException{
		
		AndroidDriver<MobileElement> driver = Capabilitiesreal();
		
		driver.findElement(MobileBy.AccessibilityId("2")).click();
		driver.findElement(MobileBy.AccessibilityId("Plus")).click();
		driver.findElement(MobileBy.AccessibilityId("5")).click();
		driver.findElement(MobileBy.AccessibilityId("Equal")).click();
		
		String Output = driver.findElement(MobileBy.AccessibilityId("Calculator input field")).getText();
		System.out.println(Output);
		

	}

}
