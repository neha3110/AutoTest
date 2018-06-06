package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Connection {
	
	
	public static void main(String[] args) throws InterruptedException, IOException  {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		System.setProperty("WebDriver Chrome Driver", "D:\\Appiums-Jars-Training\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver.manage().window().maximize();
         driver.get("http://qa.batooni.com/users/sign_in");
		
	}
}
