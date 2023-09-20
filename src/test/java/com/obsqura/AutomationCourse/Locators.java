package com.obsqura.AutomationCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	
public void webLocators() {
	
	//************************ find element by id**********************************************
	
	WebElement showmessagebutton = driver.findElement(By.id("button-one"));
	WebElement messagetextbox    = driver.findElement(By.id("single-input-field"));
	WebElement displaymessagebox = driver.findElement(By.id("message-one"));
	WebElement entervaluetextboxa = driver.findElement(By.id("value-a"));
	WebElement entervaluetextboxb = driver.findElement(By.id("value-b"));
	WebElement gettotalbutton     = driver.findElement(By.id("button-two"));
	
	//************************find element by class name*****************************************
	
	WebElement clearfix= driver.findElement(By.className("clearfix"));
	
	//***********************find element by css selector****************************************
	
	WebElement showmessagebuttonusingcss =driver.findElement(By.cssSelector("button#button-one"));//tag#id
	WebElement clearfix1 = driver.findElement(By.cssSelector("section.clearfix"));//tag.class
	WebElement showmessagebuttonusingsttribute =driver.findElement(By.cssSelector("button[id=button-one]"));//tag[attribute=value]
	
	//*********************find element by link text*******************************************
	
	WebElement checkbox =   driver.findElement(By.linkText("Checkbox Demo"));
	
	//************************find element by partial link text************************************
	
	WebElement checkbox1 = driver.findElement(By.partialLinkText("Checkbox"));
	WebElement simpleform = driver.findElement(By.partialLinkText("Simple Form"));
	WebElement radiobutton = driver.findElement(By.partialLinkText("Radio Buttons"));
	WebElement ajaxform = driver.findElement(By.partialLinkText("Ajax Form"));
	
	//***********************find element by xpath***************************************************
	
	WebElement showmsgbutton = driver.findElement(By.xpath("//button[@id='button-one']"));//basic xpath
	WebElement chekbox =driver.findElement(By.xpath("//a[contains(@href,'check-box')]"));// contains()
	
	WebElement checkbox2 = driver.findElement(By.xpath("//a[starts-with(@href,'check-box')]"));//starts-with()
	WebElement  ajaxform1 = driver.findElement(By.xpath("//a[starts-with(@href,'ajax-form')]"));
	WebElement formsubmit = driver.findElement(By.xpath("//a[starts-with(@href,'form-submit')]"));
	
	WebElement showmsg = driver.findElement(By.xpath("//button[text()='Show Message']"));// Text()
	WebElement gettotal= driver.findElement(By.xpath("//button[text()='Get Total']"));
	WebElement yourmsg = driver.findElement(By.xpath("//div[text()='Your Message : ']"));
	
	
	WebElement butn = driver.findElement(By.xpath("//button[@type='button' and @id='button-one' ]"));// and
	WebElement butn1 = driver.findElement(By.xpath("//button[@type='button' and @id='button-two' ]"));
	WebElement meesage= driver.findElement(By.xpath("//input[@class='form-control' and @id='single-input-field']"));
	WebElement btn = driver.findElement(By.xpath("//button[contains(@id,'button-one') and @class='btn btn-primary']"));
	
	WebElement showms1 = driver.findElement(By.xpath("//button[@type='button123' or @id='button-one']"));//or
	WebElement entermsg = driver.findElement(By.xpath("//input[ @id='single-input-field' or @placeholder='Message']"));
	WebElement button1 = driver.findElement(By.xpath("//button[@id='button-one' or @class='btn btn-primary1']"));
	
	
	
	
	
	
//**************************************************************************************************************
	driver.navigate().to("https://ultimateqa.com/complicated-page");
	WebElement menusearch = driver.findElement(By.xpath("//div[contains(@class,'et_pb_menu__search-container')]"));
	WebElement buton = driver.findElement(By.xpath("//a[contains(@class,'et_pb_button et_pb_button_0')]"));
	WebElement article = driver.findElement(By.xpath("//article[contains(@class,'post-579')]"));
	
	driver.navigate().to("https://ultimateqa.com/simple-html-elements-for-automation/");
	WebElement buttonid = driver.findElement(By.linkText("Click this button using \"ID\""));
	WebElement linktext = driver.findElement(By.linkText("Click me using this link text!"));
	WebElement clicklink = driver.findElement(By.linkText("Click this link"));
	
	
	driver.navigate().to("https://ultimateqa.com/filling-out-forms/");
	WebElement contactname = driver.findElement(By.name("et_pb_contact_name_0"));
	WebElement contactname1 = driver.findElement(By.name("et_pb_contact_name_1"));
	WebElement msage = driver.findElement(By.name("et_pb_contact_message_0"));
	
	WebElement contactnme = driver.findElement(By.xpath("//input[@name='et_pb_contact_name_0']"));
	WebElement contactnme1 = driver.findElement(By.xpath("//input[@name='et_pb_contact_name_1']"));
	WebElement message= driver.findElement(By.xpath("//textarea[@name='et_pb_contact_message_0']"));
	WebElement message1= driver.findElement(By.xpath("//textarea[@name='et_pb_contact_message_1']"));
	
	
	
	
	
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
