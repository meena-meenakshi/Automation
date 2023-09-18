package com.obsqura.AutomationCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	
	
	public void initilizeBrowser() {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aruna\\eclipse-workspace\\AutomationCourse\\src\\main\\java\\com\\obsqura\\AutomationCourse\\Resources\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		
	}
   public void DriverClose() {
	//driver.close();//close the parent or current window
	driver.quit();//close all instance of browser,close session completely
	
   }
	public static void main(String[] args) {

		Base base =new Base();
		base.initilizeBrowser();
		base.DriverClose();

	}

}
