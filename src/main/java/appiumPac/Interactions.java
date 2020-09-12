package appiumPac;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.android.AndroidDriver;

public class Interactions extends AppiumBase{

	public static void main(String[] args) throws MalformedURLException {
		
		
		AndroidDriver<MobileElement> driver = Appiumcapabilities();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		MobileElement ViewsBtnObj = driver.findElementByXPath("//android.widget.TextView[@text='Views']");
		
		//Tapping
		TouchAction touchActionObj=new TouchAction(driver);
		touchActionObj.tap(tapOptions().withElement(element(ViewsBtnObj))).perform();
		
		//LongPress
		MobileElement ExpalndListObj = driver.findElement(MobileBy.AndroidUIAutomator("text(\"Expandable Lists\")"));
		touchActionObj.tap(tapOptions().withElement(element(ExpalndListObj))).perform();
		
		
		MobileElement CustomAdapterObj = driver.findElement(MobileBy.AndroidUIAutomator("text(\"1. Custom Adapter\")"));
		touchActionObj.tap(tapOptions().withElement(element(CustomAdapterObj))).perform();
		
		MobileElement PeopleNamesObj = driver.findElement(MobileBy.AndroidUIAutomator("text(\"People Names\")"));
		touchActionObj.longPress(longPressOptions().withElement(element(PeopleNamesObj)).withDuration(ofSeconds(2))).release().perform();
		
		
		String Check=driver.findElement(MobileBy.AndroidUIAutomator("text(\"Sample menu\")")).getText();
		System.out.println(Check);
		
		
//		
//		driver.navigate().back();
//		driver.navigate().back();
//		driver.navigate().back();
//		
//		MobileElement dateWidgetsObj = driver.findElement(MobileBy.AndroidUIAutomator("text(\"Date Widgets\")"));
//		touchActionObj.tap(tapOptions().withElement(element(dateWidgetsObj))).perform();
//		
//		MobileElement InlineObj = driver.findElement(MobileBy.AndroidUIAutomator("text(\"2. Inline\")"));
//		touchActionObj.tap(tapOptions().withElement(element(InlineObj))).perform();
//		
//		
//		String TimetoSelect="10:50";
//		String Hrs=TimetoSelect.split(":")[0];
//		String Min=TimetoSelect.split(":")[1];
//		
//		//*[@contenet-desc='"++"']"
//		MobileElement HrsObj = driver.findElementByXPath("//*[@content-desc='"+Hrs+"']");
//		HrsObj.click();
//		
//		MobileElement SourceObj = driver.findElementByXPath("//*[@content-desc='15']");
//		MobileElement DescObj = driver.findElementByXPath("//*[@content-desc='"+Min+"']");
//		
//		touchActionObj.longPress(longPressOptions().withElement(element(SourceObj)).withDuration(ofSeconds(2))).moveTo(element(DescObj)).release().perform();
//		
//		driver.navigate().back();
//		driver.navigate().back();
//		
//		MobileElement DragandDropObj = driver.findElement(MobileBy.AndroidUIAutomator("text(\"Drag and Drop\")"));
//		touchActionObj.tap(tapOptions().withElement(element(DragandDropObj))).perform();
//		
//		MobileElement FromDragObj = driver.findElementById("io.appium.android.apis:id/drag_dot_1");
//		MobileElement ToDragObj = driver.findElementById("io.appium.android.apis:id/drag_dot_2");
//		
//		touchActionObj.longPress(longPressOptions().withElement(element(FromDragObj)).withDuration(ofSeconds(1))).moveTo(element(ToDragObj)).release().perform();
//		
//		//mohanchinna.kumar@gmail.com
//		
//		driver.navigate().back();
//		
//		String ValueToScroll="WebView";
//		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+ValueToScroll+"\"))"));
//		
//		

	}

}
