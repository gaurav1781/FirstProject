package revise_maven.revise_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {
	public static final String URL="https://www.icicidirect.com";
	public static WebDriver driver;
	
	@BeforeTest
	public void setURL()
	{
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\Drivers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
	}
	
	@Test
	  public void f1() 
	  {
		driver.findElement(By.xpath("//*[@id=\"divSearch\"]/a[3]")).click();
		//driver.findElement(By.xpath("//*[@id=\"txtuid\"]")).sendKeys("Hi");
		//driver.findElement(By.xpath("//*[@id=\"txtPass\"]")).sendKeys("Hi");
		//driver.findElement(By.xpath("//*[@id=\"txtDOB\"]")).sendKeys("AOFPP");
		//driver.findElement(By.xpath("//*[@id=\"btnlogin\"]")).click();
	  }
	@AfterTest()
	public void endtest() throws InterruptedException
	{
		//driver.wait(10);
		driver.quit();
	}
	
}
