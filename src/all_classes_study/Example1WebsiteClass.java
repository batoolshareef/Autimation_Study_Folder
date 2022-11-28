package all_classes_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1WebsiteClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/index.html");
	String h1tag =	driver.findElement(By.id("h1_tag")).getText();
	System.out.println(h1tag);
	
	String h6tag = driver.findElement(By.className("parg_cls")).getText();
	System.out.println(h6tag);

	String h1tag2 = driver.findElement(By.cssSelector("h1#h1_tag")).getText().toUpperCase();
	System.out.println(h1tag2);
	
	String h6tag2 = driver.findElement(By.cssSelector("p.parg_cls")).getText().toUpperCase();
	System.out.println(h6tag2);
	
	String bodytag = driver.findElement(By.cssSelector("body")).getTagName().toUpperCase();
	System.out.println(bodytag);
	Thread.sleep(3000);
	
	driver.findElement(By.id("inpt_email")).sendKeys("batoolalshareef@gmail.com");
	Thread.sleep(3000);
	
	driver.findElement(By.id("inpt_pass")).sendKeys("bbb12345");
	Thread.sleep(3000);
	
	driver.findElement(By.id("reset_btn")).click();
	Thread.sleep(3000);
	
	}

}
