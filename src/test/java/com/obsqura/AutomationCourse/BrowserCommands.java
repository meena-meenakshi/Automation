package com.obsqura.AutomationCourse;

public class BrowserCommands extends Base {
	
	public void browserCommands() {
	String url=	driver.getCurrentUrl();
	String pagesource= driver.getPageSource();
	String title= driver.getTitle();
	}

	public static void main(String[] args) {
		
		BrowserCommands browsercommand = new BrowserCommands();
         browsercommand.initilizeBrowser();
         browsercommand.browserCommands();
         browsercommand.DriverClose();
	}

}
