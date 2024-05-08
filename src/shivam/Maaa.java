package shivam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver", "D:\\eclipse-java-2023-12-R-win32-x86_64\\shivam\\driver\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("https:/rahulshettyacademy.com");
 
	}

}
