import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingFaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriver driver=new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranjith\\Downloads\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("email")).sendKeys("username");
		

	}

}
