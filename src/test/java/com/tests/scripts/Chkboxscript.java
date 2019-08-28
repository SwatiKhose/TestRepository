package com.tests.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chkboxscript 
{
	//modifying file.. by adding this file
	WebDriver driver;
	
		@Test
		public void webDriver()    
		{
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		driver.get("http://www.ironspider.ca/forms/checkradio.htm");
		JavascriptExecutor je=((JavascriptExecutor)driver);
		je.executeScript("scroll(0,400)");
		//Thread.sleep(900);
		}
		@Test (priority=1)	
		public void checkBox1()
		{		
			//driver.get("http://www.ironspider.ca/forms/checkradio.htm");
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/blockquote[1]/form/input[1]"))));
		WebElement e =driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/blockquote[1]/form/input[1]"));
		System.out.println(e.isDisplayed());
		System.out.println(e.isEnabled());
		
		e.click();
		//e.click();
		} 
		@Test (priority=2)	
		public void checkbox2()
		{
			//driver.get("http://www.ironspider.ca/forms/checkradio.htm");
		WebElement e1 =driver.findElement(By.cssSelector("blockquote.Example:nth-child(17) > form:nth-child(1) > input:nth-child(5)"));
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("blockquote.Example:nth-child(17) > form:nth-child(1) > input:nth-child(5)"))));
		System.out.println(e1.isDisplayed());
		System.out.println(e1.isEnabled());
		e1.click();
		}
		@Test (priority=3)	
		public void checkBox3() 
		{
			//driver.get("http://www.ironspider.ca/forms/checkradio.htm");
		WebElement e2 =driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/blockquote[1]/form/input[3]"));
		System.out.println(e2.isDisplayed());
		System.out.println(e2.isEnabled());
		e2.click();
		}
		@Test (priority=4)		
		public void checkBox4() 
		{
			//driver.get("http://www.ironspider.ca/forms/checkradio.htm");
		WebElement e3 =driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/blockquote[1]/form/input[4]"));
		System.out.println(e3.isDisplayed());
		System.out.println(e3.isEnabled());
		e3.click();
	//Thread.sleep(300);
		}
			
		}

	


