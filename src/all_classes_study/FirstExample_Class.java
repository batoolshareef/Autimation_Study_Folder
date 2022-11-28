package all_classes_study;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstExample_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/en");

	}

}
