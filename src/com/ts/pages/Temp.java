package com.ts.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Temp {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.autodesk.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(35,TimeUnit.SECONDS );
		
		//driver.findElement(By.cssSelector(".wd-light>img")).click();
		//Actions ac=new Actions(driver);
		/*driver.findElement(By.linkText("Sign In")).click();
		WebElement account=driver.findElement(By.xpath("div/ul/li[8]/ul/li[2]/a"));
		ac.moveToElement(account).clickAndHold().build().perform();
		
		String sign="html/body/div[2]/header/div[1]/div[1]/div/div/div/div[1]/div/div/div/div/div[1]/div/div[2]/div/div/div/ul/li[8]/a/span";
		String auto="html/body/div[2]/header/div[1]/div[1]/div/div/div/div[1]/div/div/div/div/div[1]/div/div[2]/div/div/div/ul/li[8]/ul/li[2]/a";
		WebElement main=driver.findElement(By.xpath(sign));
		WebElement submenu=driver.findElement(By.xpath(auto));
		
		Actions ac=new Actions(driver);
		ac.moveToElement(main).build().perform();
		submenu.click();*/
		
		driver.findElement(By.linkText("SIGN IN")).click();
		String currentUrl=driver.getCurrentUrl();
		System.out.println("URL is :"+currentUrl);
		driver.findElement(By.partialLinkText("Account")).click();
		Thread.sleep(3000L);
		driver.navigate().to("http://www.autodesk.com");
		
		
		
		
		
		
	}

}
