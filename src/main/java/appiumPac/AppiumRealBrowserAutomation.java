package appiumPac;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppiumRealBrowserAutomation extends AppiumCapabilitiesBrowser{

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<MobileElement> driver = capablitiesBrowser();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		MobileElement SearchBtn = driver.findElement(By.xpath("//div[@class='_3CzzrP']//input[@placeholder='Search for Products, Brands and More']"));
		SearchBtn.click();
		
		MobileElement CloseBtn = driver.findElement(By.xpath("//img[contains(@src,'data:image/svg+xml;base64,PHN2ZyB3aWR0aD0iMTUiIGhlaWdodD0iMTUiIHZpZXdCb3g9IjAgMCAxNSAxNSIgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIj48cGF0aCBkPSJNMS4wNjMgMWwxMi4zIDEyLjQyNW0uMDYzLTEyLjM2MkwxIDEzLjM2MyIgc3Ryb2tlPSIjZmZmIiBzdHJva2Utd2lkdGg9IjEuNSIgc3Ryb2tlLWxpbmVjYXA9InJvdW5kIiBzdHJva2UtbGluZWpvaW49InJvdW5kIiBmaWxsPSJub25lIi8+PC9zdmc+')]"));
		CloseBtn.click();
		
		MobileElement SearchBtnAnother = driver.findElement(By.xpath("//input[@id='input-search']"));
		SearchBtnAnother.clear();
		SearchBtnAnother.click();
		SearchBtnAnother.sendKeys("Samsung");
		
		List<MobileElement> SearchedProductOptions = driver.findElements(By.xpath("//div[@class='P7DhQr']"));
		for(MobileElement EachProduct:SearchedProductOptions) {
			System.out.println(EachProduct.getText());
		}
		
		
	}

}
