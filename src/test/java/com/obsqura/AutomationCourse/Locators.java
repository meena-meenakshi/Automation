package com.obsqura.AutomationCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	
public void webLocators() {
	WebElement showmessagebutton = driver.findElement(By.id("button-one"));
	WebElement messagetextbox    = driver.findElement(By.id("single-input-field"));
	WebElement displaymessagebox = driver.findElement(By.id("message-one"));
	WebElement entervaluetextboxa = driver.findElement(By.id("value-a"));
	WebElement entervaluetextboxb = driver.findElement(By.id("value-b"));
	WebElement gettotalbutton     = driver.findElement(By.id("button-two"));
	
	
	WebElement clearfix= driver.findElement(By.className("clearfix"));
	WebElement showmessagebuttonusingcss =driver.findElement(By.cssSelector("button#button-one"));//tag#id
	WebElement clearfix1 = driver.findElement(By.cssSelector("section.clearfix"));//tag.class
	WebElement showmessagebuttonusingsttribute =driver.findElement(By.cssSelector("button[id=button-one]"));//tag[attribute=value]
	
	driver.navigate().to("https://gh-users-search.netlify.app/");
	WebElement formcontrol= driver.findElement(By.className("form-control"));
	WebElement sectioncenter= driver.findElement(By.className("pink"));
	WebElement sectioncenter1= driver.findElement(By.className("green"));
	WebElement bio= driver.findElement(By.className("bio"));
	WebElement links= driver.findElement(By.className("links"));
	
	driver.navigate().to("https://thinking-tester-contact-list.herokuapp.com/");
	WebElement email =driver.findElement(By.cssSelector("input#email"));
	WebElement password =driver.findElement(By.cssSelector("input#password"));
	WebElement submit =driver.findElement(By.cssSelector("button#submit"));
	
	driver.navigate().to("https://ultimateqa.com/simple-html-elements-for-automation/");
	WebElement submitbutton = driver.findElement(By.cssSelector("button.buttonClass"));
	WebElement wrap = driver.findElement(By.cssSelector("div.swp-hidden-panel-wrap"));
	WebElement doc = driver.findElement(By.cssSelector("div.et-boc"));
	
	driver.navigate().to("https://www.saucedemo.com/");
	WebElement usernme =driver.findElement(By.cssSelector("input[data-test=username]"));
	WebElement login =driver.findElement(By.cssSelector("input[value=Login]"));
	WebElement pswrd =driver.findElement(By.cssSelector("input[placeholder=Password]"));
	
	
	
	
	
}
	
	
	public static void main(String[] args) {
		Locators locate = new Locators();
		locate.initilizeBrowser();
		locate.webLocators();
		locate.DriverClose();

	}

}
