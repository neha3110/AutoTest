package test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.corba.se.spi.orbutil.fsm.Action;
import com.sun.javafx.scene.paint.GradientUtils.Point;

import javafx.scene.control.Alert;

public class CreateCampign_Admin{

	public static void main(String[] args) throws InterruptedException, IOException  {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		System.setProperty("WebDriver Chrome Driver", "D:\\Appiums-Jars-Training\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver.manage().window().maximize();
         driver.get("http://qa.batooni.com/users/sign_in");
		
//*************ADMIN*******************	

/*driver.findElement(By.id("userName")).sendKeys("neha");
		
		driver.findElement(By.id("inputPassword")).sendKeys("nehajain");
		driver.findElement(By.id("loginSubmit")).click();
		
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("New Campaign")).click();
		driver.findElement(By.id("campName")).sendKeys("Democamp");
		driver.findElement(By.id("client")).sendKeys("batooni");
		driver.findElement(By.id("brand")).sendKeys("infobeans");

		WebElement we = driver.findElement(By.id("uploadForm"));
				we.click();
				
		we.sendKeys("C:/Users/neha1.jain/Downloads/Batooni Ads/Batooni1b.mp4");*/
		
		
//*****************ADVERTISER LOGIN*********************************
		
		
		
		driver.findElement(By.id("userName")).sendKeys("nehaadv	");
		
		driver.findElement(By.id("inputPassword")).sendKeys("nehajain");
		driver.findElement(By.id("loginSubmit")).click();
		
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(10000);
		
		
		 String homePage = "https://qa.batooni.com/";
	        
	        String url = "";
	        HttpURLConnection huc = null;
	        int respCode = 200;
	        
	        driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        
	        driver.get(homePage);
	        
	        List<WebElement> links = driver.findElements(By.tagName("a"));
	        
	        Iterator<WebElement> it = links.iterator();
	        
	        while(it.hasNext()){
	            
	            url = it.next().getAttribute("href");
	            
	            System.out.println(url);
	        
	            if(url == null || url.isEmpty()){
	System.out.println("URL is either not configured for anchor tag or it is empty");
	                continue;
	            }
	            
	            if(!url.startsWith(homePage)){
	                System.out.println("URL belongs to another domain, skipping it.");
	                continue;
	            }
	            
	            try {
	                huc = (HttpURLConnection)(new URL(url).openConnection());
	                
	                huc.setRequestMethod("HEAD");
	                
	                huc.connect();
	                
	                respCode = huc.getResponseCode();
	                
	                if(respCode >= 400){
	                    System.out.println(url+" is a broken link");
	                }
	                else{
	                    System.out.println(url+" is a valid link");
	                }
	                    
	            } catch (MalformedURLException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            } catch (IOException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	        }
	        
	        driver.quit();

		
		
		
		
		//for broken links coment all code.
		/*
		
		
		//tap on hamburger icon
		driver.findElement(By.xpath("//*[@id=\"toggleMenubar\"]/a/img")).click();
		
		//tap on hamburger and navigate to Reports
		
		driver.findElement(By.xpath("//*[@id=\"mm-0\"]/ul/li[2]/a/span")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"mm-0\"]/ul/li[3]/a/span")).click();
		//tap on hamburger and navigate to Settings
		//*[@id="mm-0"]/ul/li[3]/a/span

		//tap on hamburger and navigate to Analytics
		
			
		
		//*[@id="mm-0"]/ul/li[4]/a/span
		//tap on hamburger and navigate to custom registration
		//*[@id="mm-0"]/ul/li[5]/a/span
		//tap on hamburger and navigate to logout
		//*[@id="mm-0"]/ul/li[6]/a/span
		driver.findElement(By.xpath("//*[@id=mm-0']/ul/li[3]/a/span")).click();

		//*[@id="mm-0"]/ul/li[1]/a/span
		
		//click for sorting by client name
		
		driver.findElement(By.xpath("//*[@id=\"campaignDashboradList\"]/div[1]/table/tbody/tr[1]/th[1]")).click();
		
		//click for sorting by brand name
		
		driver.findElement(By.xpath("//*[@id=\"campaignDashboradList\"]/div[1]/table/tbody/tr[1]/th[2]")).click();
				
	//click for sorting by campign  name
		
		driver.findElement(By.xpath("//*[@id=\"campaignDashboradList\"]/div[1]/table/tbody/tr[1]/th[3]")).click();
		
		//click for sorting by start date
		
		driver.findElement(By.xpath("//*[@id=\"campaignDashboradList\"]/div[1]/table/tbody/tr[1]/th[4]")).click();
		
		//click for sorting by end date
		
		driver.findElement(By.xpath("//*[@id=\"campaignDashboradList\"]/div[1]/table/tbody/tr[1]/th[5]")).click();
				
	   //click for sorting by status
				
		driver.findElement(By.xpath("//*[@id=\"campaignDashboradList\"]/div[1]/table/tbody/tr[1]/th[6]")).click();
		
				
		
		Thread.sleep(10000);
		
		
	
		
		driver.findElement(By.xpath("//*[@id=\"toggleMenubar\"]/a/img")).click();
		
		//Tap on create campign button 
		driver.findElement(By.linkText("New Campaign")).click();
		driver.findElement(By.id("campName")).sendKeys("Democamp11");
		driver.findElement(By.id("client")).sendKeys("batooni11");
		driver.findElement(By.id("brand")).sendKeys("infobeans11");
		
		//WebElement slider = driver.findElement(By.xpath("//*[@id=\"ageGroup\"]"));
	    
		WebElement  element = driver.findElement(By.xpath("//div[@id='ageGroup']/span[text()='13']"));

	    org.openqa.selenium.Point point = element.getLocation();
	    int xcord = point.getX();
	    System.out.println("Position of the webelement from left side is "+xcord +" pixels");
	    int ycord = point.getY();
	    System.out.println("Position of the webelement from top side is "+ycord +" pixels");
	    
	    
		WebElement Sourcelocator = driver.findElement(By.xpath("//div[@id='ageGroup']/span[text()='13']"));

		Actions act= new Actions(driver);
		
		act.clickAndHold(Sourcelocator);
		//act.moveToElement(driver.findElement(By.xpath("//div[@id='ageGroup']/span[text()='32']"))).perform();
		
		
		
		act.moveByOffset(100, 0);
		act.release().perform();
		
		driver.findElement(By.id("campaign_ads_served_per_day")).sendKeys("10");
		driver.findElement(By.id("campaign_max_impression_per_user")).sendKeys("8");
		
		
		


			Thread.sleep(20000);
			WebElement we = driver.findElement(By.id("uploadForm"));
			we.click();

		//To call the AutoIt script
			WebDriverWait wd = new WebDriverWait(driver, 100);
			
	 Runtime.getRuntime().exec("D:\\Appiums-Jars-Training\\Uploadfile.exe");
	
	
	Thread.sleep(100000);
	driver.findElement(By.id("save")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"okModal\"]/div/div/div[3]/div/button")).click();
	
	WebDriverWait wait = new WebDriverWait(driver, 20);
    wait.until(ExpectedConditions.alertIsPresent());
    org.openqa.selenium.Alert alert1 = driver.switchTo().alert();
    
	alert1.accept();
	
	//driver.switchTo().alert().accept();
	
//**********Campign Search*********************	
	
	
//search by client name
	
	driver.findElement(By.id("client_name")).sendKeys("oko");
	
	driver.findElement(By.id("dashboardButtonSearch")).click();
	
	
	//search by Brand name
	
	driver.findElement(By.id("brand_name")).sendKeys("ttyty");
	
	driver.findElement(By.id("dashboardButtonSearch")).click();
	
	
	//search by campign name
	
	driver.findElement(By.id("name")).sendKeys("e");
	
	driver.findElement(By.id("dashboardButtonSearch")).click();
	
	//tap on show extra filter.
	Thread.sleep(10000);
	driver.findElement(By.xpath("//*[@id=\"campaign-dashboard\"]/div/div/div/div[1]/div[1]/div[4]/div[2]/div")).click();
	
	//tap on hide  extra filter.
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"campaign-dashboard\"]/div/div/div/div[1]/div[1]/div[4]/div[2]/div[2]")).click();
	
	
	//tap on reset filters
	Thread.sleep(10000);
	driver.findElement(By.xpath("//*[@id=\"campaign-dashboard\"]/div/div/div/div[1]/div[1]/div[4]/div[3]/div")).click();
	
	//search by start date
	 
	Thread.sleep(10000);
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElementById('startDate').setAttribute('value','13 May 2018')");
	
	//search by end date
	 
		Thread.sleep(10000);
		
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("document.getElementById('endDate').setAttribute('value','19 May 2018')");
	
	//search by state name	
	Thread.sleep(10000);
	//WebElement g=driver.findElement(By.id("city-state-search"));
	//WebElement g=driver.findElement(By.xpath("//*[@id=\"campaign_city\"]"));
	//driver.findElement(By.className("form-control")).click();
	//g.click();
	//Thread.sleep(10000);
	//g.sendKeys("ind");
	//Thread.sleep(10000);
	
	driver.findElement(By.id("dashboardButtonSearch")).click();
	
	
	//search by city name

	
	//driver.findElement(By.id("startDate")).click();
	//search by end date .
	
//	driver.findElement(By.id("endDate")).click();
	
	//*[@id="campaign_city"]/div/div/div/div[1]/div[2]/div[1]/div
	
	

	
	//*[@id="campaign_city"]
	
	//city-state-search value 24_City,564_City	
	
	
	
*/	
	
	
	
	}

}
