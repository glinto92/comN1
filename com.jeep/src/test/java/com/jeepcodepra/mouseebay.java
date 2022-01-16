package com.jeepcodepra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseebay {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebElement a=driver.findElement(By.xpath("//a[contains(text(),'My eBay')][1]"));
		WebElement b = driver.findElement(By.xpath("//a[contains(text(),' Selling')]"));
		Actions ac=new Actions(driver);
		
		ac.moveToElement(a).moveToElement(b).click().build().perform();
		
	}

}
