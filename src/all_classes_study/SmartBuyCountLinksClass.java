package all_classes_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmartBuyCountLinksClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://smartbuy-me.com/smartbuystore/en");
//
//		System.out.println("---------------------------------------------------------");
//		// 1. count all the links 
//		System.out.println("---------------------------------------------------------");
//		int all_links = driver.findElements(By.tagName("a")).size();
//		
//		System.out.println("1. The Count of all links in site is: " + all_links);
//
//		System.out.println("---------------------------------------------------------");
//		// 2. count links in the red top div and print names
//		System.out.println("---------------------------------------------------------");
//		WebElement red_top_hdr = driver.findElement(By.cssSelector("body > main > header > div:nth-child(1)"));
//		int top_hdr_links = red_top_hdr.findElements(By.tagName("a")).size();
//		System.out.println("2. The Count of links in the top header is: " + top_hdr_links);
//

		// 3. count links in the black top div
//		System.out.println("---------------------------------------------------------");
//		WebElement black_top_hdr = driver.findElement(By.cssSelector(".row.padd-wide.top-footer-list"));
//		int top_blk_hdr_links = black_top_hdr.findElements(By.tagName("a")).size();
//		System.out.println("3. The Count of links in the top black header is: " + top_blk_hdr_links);
//		System.out.println("---------------------------------------------------------");
//		
//		for (int i=0; i<top_blk_hdr_links;i++) {
//			System.out.println(i+1 + "- "+black_top_hdr.findElements(By.tagName("a")).get(i).getText());
//		
//		}
//	
//		System.out.println("---------------------------------------------------------");

		// 4. count links in the yellow top div
//		System.out.println("---------------------------------------------------------");
//		WebElement yellow_top_hdr = driver.findElement(By.cssSelector(".row.padd-wide.yellow-back"));
//		int top_ylow_hdr_links = yellow_top_hdr.findElements(By.tagName("a")).size();
//		System.out.println("4. The Count of links in the top yellow header is: " + top_ylow_hdr_links);
//		System.out.println("---------------------------------------------------------");
//		
//		for (int i=0; i<top_ylow_hdr_links;i++) {
//			System.out.println(i+1 + "- "+yellow_top_hdr.findElements(By.tagName("a")).get(i).getText());
//
//		}
//	
//		System.out.println("---------------------------------------------------------");

		// 5. count links in the yellow top div
//		System.out.println("---------------------------------------------------------");
//		WebElement white_top_hdr = driver.findElement(By.cssSelector(".nav__links.nav__links--products.js-offcanvas-links"));
//		int top_wht_hdr_links = white_top_hdr.findElements(By.tagName("a")).size();
//		System.out.println("5. The Count of links in the top yellow header is: " + top_wht_hdr_links);
//		System.out.println("---------------------------------------------------------");
//		
//		for (int i=0; i<top_wht_hdr_links;i++) {
//			System.out.println(i+1 + "- "+white_top_hdr.findElements(By.tagName("a")).get(i).getText());
//
//		}
//	
//		System.out.println("---------------------------------------------------------");

		// 6. count links in the center div
//				System.out.println("---------------------------------------------------------");
//				WebElement center_div = driver.findElement(By.cssSelector("div[class='padd-wide']"));
//				int cntr_links = center_div.findElements(By.tagName("a")).size();
//				System.out.println("6. The Count of links in the top yellow header is: " + cntr_links);
//				System.out.println("---------------------------------------------------------");
//				
//				for (int i=0; i<cntr_links;i++) {
//					System.out.println(i+1 + "- "+center_div.findElements(By.tagName("a")).get(i).getText());
//
//				}
//			
//				System.out.println("---------------------------------------------------------");

		// 7. count links in the center footer div
//				System.out.println("---------------------------------------------------------");
//				WebElement center_ftr_div = driver.findElement(By.cssSelector(".center-footer"));
//				int cntr_ftr_links = center_ftr_div.findElements(By.tagName("a")).size();
//				System.out.println("7. The Count of links in the top yellow header is: " + cntr_ftr_links);
//				System.out.println("---------------------------------------------------------");
//				
//				for (int i=0; i<cntr_ftr_links;i++) {
//					System.out.println(i+1 + "- "+center_ftr_div.findElements(By.tagName("a")).get(i).getText());
//
//				}
//			
//				System.out.println("---------------------------------------------------------");

		// 8. count links in the last footer div
//				System.out.println("---------------------------------------------------------");
//				WebElement last_ftr_div = driver.findElement(By.cssSelector(".col-md-12.sectioncopyone"));
//				int lst_ftr_links = last_ftr_div.findElements(By.tagName("a")).size();
//				System.out.println("8. The Count of links in the top yellow header is: " + lst_ftr_links);
//				System.out.println("---------------------------------------------------------");
//				
//		for (int i=0; i<lst_ftr_links;i++) {
//					System.out.println(i+1 + "- "+last_ftr_div.findElements(By.tagName("a")).get(i).getText());
///				}
//			
//				System.out.println("---------------------------------------------------------");

		// 9. count links in the last footer div
		System.out.println("---------------------------------------------------------");
		WebElement copyright_ftr_div = driver
				.findElement(By.cssSelector("div[class='col-md-12 sectioncopytow'] div[class='copyright']"));
		int cr_ftr_links = copyright_ftr_div.findElements(By.tagName("a")).size();
		System.out.println("9. The Count of links in the top yellow header is: " + cr_ftr_links);
		System.out.println("---------------------------------------------------------");

		for (int i = 0; i < cr_ftr_links; i++) {
			System.out.println(i + 1 + "- " + copyright_ftr_div.findElements(By.tagName("a")).get(i).getText());

		}

		System.out.println("---------------------------------------------------------");

	}

}