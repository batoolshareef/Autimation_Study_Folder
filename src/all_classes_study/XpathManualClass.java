package all_classes_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathManualClass {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "e:\\Chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://127.0.0.1:5500/index.html");
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//input[@placeholder='Email or Phone No.']")).sendKeys("batoolalshareef@gmail.com");
	Thread.sleep(3000);

	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("b23458888");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[@id='btn_login']")).click();
	Thread.sleep(5000);
	
//form clear doesn't work
//	driver.findElement(By.tagName("form")).clear();
//	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[@id='btn_reset']")).click();
	Thread.sleep(5000);
	
	}

}
