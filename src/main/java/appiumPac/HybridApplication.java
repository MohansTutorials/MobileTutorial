package appiumPac;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class HybridApplication extends AppiumCapabilitiesReal{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		AndroidDriver<MobileElement> driver = Capabilitiesreal();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.findElementByAccessibilityId("Search").click();
		
		driver.findElementById("com.whatsapp:id/search_src_text").sendKeys("Charan");
		List<MobileElement> AllConversations = driver.findElementsById("com.whatsapp:id/conversations_row_contact_name");
		
		for(MobileElement EachConversation:AllConversations) {
			if(EachConversation.getText().equalsIgnoreCase("Charan")) {
				EachConversation.click();
				break;
			}
		}
		
		driver.findElementByAccessibilityId("www.flipkart.com").click();
		
		Set<String> AllWindowHandles = driver.getContextHandles();
		for(String EachWindowHandle:AllWindowHandles) {
			System.out.println(EachWindowHandle);
		}
		
		
		driver.context((String) AllWindowHandles.toArray()[1]);
		driver.context("WEBVIEW_chrome");
		Thread.sleep(3000);
		MobileElement SearchBtn = driver.findElement(By.xpath("//input[@name='q']"));
		SearchBtn.click();
		
		MobileElement SearchBtnAnother = driver.findElement(By.xpath("//input[@id='input-search']"));
		SearchBtnAnother.clear();
		SearchBtnAnother.click();
		SearchBtnAnother.sendKeys("Samsung");
		
		
	}

}
