package appiumPac;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;


public class AppiumFirstSample extends AppiumBase{

	public static void main(String[] args) throws InterruptedException, IOException, TesseractException {
		
		AndroidDriver<MobileElement> driver = Appiumcapabilities();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		driver.openNotifications();
		
		MobileElement NotificationsParent = driver.findElementByClassName("android.widget.ScrollView");
		List<MobileElement> AllNotifications = NotificationsParent.findElementsByClassName("android.widget.FrameLayout");
		for(MobileElement EachNotification:AllNotifications) {
			try {
			System.out.println(EachNotification.findElementById("android:id/app_name_text").getText());
			}catch(Exception e) {
			}
		}
		
		//driver.findElementByXPath("//android.widget.Button[@text='Displays a Toast']").click();
		//Thread.sleep(700);
		//System.out.println(driver.getPageSource());
//		String ImagePath="D:\\ApexAppium\\appium\\appiumScreenshot.png";
//		ITesseract TesractObj=new Tesseract();
//		TesractObj.setDatapath("tessdata");
//		String ImageData = TesractObj.doOCR(new File(ImagePath));
//		System.out.println(ImageData);
		
		
//		driver.findElementByXPath("//android.widget.Button[@text='Display text view']").click();
//		
//		List<MobileElement> TextElementsinHomePage = driver.findElementsByXPath("//android.widget.TextView");
//		List<String> AllTextViews=new LinkedList<String>();
//		for(MobileElement eachTextElement:TextElementsinHomePage) {
//			//System.out.println(eachTextElement.getText());
//			AllTextViews.add(eachTextElement.getText());
//		}
//		
//		if(AllTextViews.contains("Text is sometimes displayed")) {
//			System.out.println("Display Text View Functioanlity validated Succesfully");
//		}else {
//			System.out.println("Display Text View Functioanlity validation Unsuccesfull");
//		}
//		
//		MobileElement ShowProgressButton = driver.findElementByXPath("//android.widget.Button[@text='Show Progress Bar for a while']");
//		ShowProgressButton.click();
//		
//		MobileElement ProgressBar = driver.findElementByClassName("android.widget.ProgressBar");
//		try {
//		int loopctrl=0;
//		while(ProgressBar.isDisplayed()) {
//			if(loopctrl>500) {
//				break;
//			}
//			loopctrl=loopctrl+1;
//			Thread.sleep(1000);
//	     }
//		}catch(Exception e) {
//			System.out.println("Element is loaded!! please go");
//			Thread.sleep(2000);
//		}
//		
//		//property(""value)
//		MobileElement WelcomeNewRegisterPage = driver.findElement(MobileBy.AndroidUIAutomator("text(\"Welcome to register a new User\")"));
//		if(WelcomeNewRegisterPage.isDisplayed()) {
//			System.out.println("Show Progress bar redirectd us to register Page");
//		}else {
//			System.out.println("Show Progress bar Not redirectd us to register Page");
//		}
//		
//		MobileElement ProgrammingLaunguageBtn = driver.findElementByClassName("android.widget.Spinner");
//		ProgrammingLaunguageBtn.click();
//		
//		String UserLaunInput="Javascript";
//		List<MobileElement> LaunguageRadioBtns = driver.findElementsByClassName("android.widget.CheckedTextView");
//		for(MobileElement eachLaunEle:LaunguageRadioBtns) {
//				if(eachLaunEle.getText().equalsIgnoreCase(UserLaunInput)) {
//					System.out.println(eachLaunEle.getText());
//					eachLaunEle.click();
//					break;
//				}
//		}
//		
//		driver.findElementById("io.selendroid.testapp:id/inputUsername").sendKeys("UserName");
//		driver.findElementById("io.selendroid.testapp:id/inputEmail").sendKeys("Email@gmail.com");
//		driver.findElementById("io.selendroid.testapp:id/inputPassword").sendKeys("Password");
//		driver.findElementById("io.selendroid.testapp:id/inputName").clear();
//		driver.findElementById("io.selendroid.testapp:id/inputName").sendKeys("InputName");
//		driver.findElementById("io.selendroid.testapp:id/input_adds").click();
//		
//		driver.navigate().back();
//		
//		driver.findElementById("io.selendroid.testapp:id/btnRegisterUser").click();
//		
//		
//		List<MobileElement> AllTableRows = driver.findElementsByClassName("android.widget.TableRow");
//		
//		for(MobileElement EachTableRow:AllTableRows) {
//			if(EachTableRow.findElementsByClassName("android.widget.TextView").size()==2) {
//				System.out.println(EachTableRow.findElementsByClassName("android.widget.TextView").get(0).getText()
//				+"--"+EachTableRow.findElementsByClassName("android.widget.TextView").get(1).getText());
//			}
//			
//		}
//		
//		//Screenshot
//		TakesScreenshot scrShotObj=((TakesScreenshot)driver);
//		File ScreenshotFilevar = scrShotObj.getScreenshotAs(OutputType.FILE);
//		String ProjFolPath=System.getProperty("user.dir");
//		File DestFile=new File(ProjFolPath+"\\VerifyUserScreenshot.png");
//		System.out.println(DestFile.toString());
//		FileUtils.copyFile(ScreenshotFilevar, DestFile);
		
		
				
}
}
