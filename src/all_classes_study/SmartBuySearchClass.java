package all_classes_study;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SmartBuySearchClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				
		driver.manage().window().maximize();
		driver.get("https://smartbuy-me.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("js-site-search-input")).sendKeys("ipad");
		Thread.sleep(3000);
		driver.findElement(By.id("js-site-search-input")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		String srch_reslt = driver.findElement(By.className("border_none")).getText();
		System.out.println(srch_reslt);
		
	}

}
