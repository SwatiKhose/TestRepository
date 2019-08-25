package com.tests.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdwnlst {
	WebDriver driver;
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	@Test
	public void ddList()
	{
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ironspider.ca/forms/dropdowns.htm");
	}
	@Test
	public void ddList1()
	{
	
		WebElement e= driver.findElement(By.cssSelector(".MiniMenu > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)"));
		e.click();
		Select se = new Select(driver.findElement(By.name("coffee")));
		//se.selectByIndex(3);
		se.selectByValue("regular");
		//se.selectByVisibleText("Black");

	}

}
