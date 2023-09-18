package com.obsqura.AutomationCourse;

public class NavigationCommands extends Base {
	
	public void navigation() {
		driver.navigate().to("https://www.toolsqa.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	
	}
	
	

	public static void main(String[] args) {
		NavigationCommands navigationcommands= new NavigationCommands();

		navigationcommands.initilizeBrowser();
		navigationcommands.navigation();
		navigationcommands.DriverClose();
		
	}

}
