package all_classes_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLoginClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);

		driver.findElement(By.name("email")).sendKeys("bbeeee@gmail.com");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#pass")).sendKeys("bbeeee@");
		Thread.sleep(3000);

		driver.findElement(By.className("_51sy")).click();
		Thread.sleep(3000);
		
	String error_msg = driver.findElement(By.className("_9ay7")).getText();
System.out.println(error_msg);
		//_9ay7
	}

}
