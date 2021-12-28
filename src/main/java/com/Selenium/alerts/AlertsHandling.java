package com.Selenium.alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("cusid")));
//		FluentWait<T>
		driver.findElement(By.name("cusid")).sendKeys("testing");
		driver.findElement(By.name("cusid")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
//		driver.findElement(By.name("submit")).click();
		driver.switchTo().alert().dismiss();
//		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		String s=driver.switchTo().alert().getText();
		System.out.println("Alert message: "+s);
		driver.switchTo().alert().accept();
		
		
	}

}
