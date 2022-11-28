package all_classes_study;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/en");
		Thread.sleep(3000);

		//open new tab in the same browser
			driver.switchTo().newWindow(WindowType.TAB);
		
		//open new url with the active opened tab
			driver.navigate().to("https://www.google.com/en");
			Thread.sleep(3000);

		//get the windows ids in Array
			ArrayList<String> wind = new ArrayList<String>(driver.getWindowHandles());
	     
		//switch to active tab
	 
			for (int i=0;i<wind.size();i++) 
			{
				driver.switchTo().window(wind.get(i));
				Thread.sleep(3000);
			}
		
		//back to previous with new window
		//	driver.navigate().back();
		//	Thread.sleep(3000);
		
		
		//forward to previous with new window
		//	driver.navigate().forward();
		//	Thread.sleep(3000);
		
	
	}

}