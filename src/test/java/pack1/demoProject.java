package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demoProject {

	@Parameters("Browser")
	@Test
	public void startBrowser(String browserName) {
		
		System.out.println("Parameter value is  "+browserName);
		WebDriver driver =null;
		if(browserName.contains("Chrome")) {
			 driver = new ChromeDriver();
		}else if(browserName.contains("Edge")) {
			driver = new EdgeDriver();
		}
	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Assert.assertTrue(driver.getTitle().contains("Orange"), "Title does not match");
		driver.quit();
	}
}
