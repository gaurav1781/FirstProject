import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firstjava
{

	public static void main(String[] args) throws Exception
	{
		/*int g=10;
		System.out.print(g);*/
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\Drivers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Drivers\\chromedriver.exe");
		/*FirefoxDriver f1=new FirefoxDriver();*/
		ChromeDriver f1=new ChromeDriver();
		f1.get("http://mail.google.com");
		FileInputStream file1=new FileInputStream("D:\\Selenium\\First.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file1);
		XSSFSheet sheet=wb.getSheetAt(0);
			//	Row row=sheet.getRow(0);
		//Cell cell=row.getCell(0);
		f1.findElementByXPath("//*[@id=\"identifierId\"]").sendKeys(sheet.getRow(1).getCell(0).toString());
		f1.findElementByXPath("//*[@id=\"identifierNext\"]").click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		f1.findElementByXPath("//*[@id=\"password\"]/div[1]/div/div[1]/input").sendKeys(sheet.getRow(1).getCell(1).toString());
		f1.findElementByXPath("//*[@id=\"passwordNext\"]").click();
		f1.manage().window().maximize();
		List<WebElement> l1=f1.findElements(By.className("bqe"));
		for (WebElement myelement : l1)
		{
			String link=myelement.getText();
			System.out.println(link);
			/*System.out.println(myelement);*/
		}
		/*f1.findElementByXPath("//*[@id=\"gb\"]/div[2]/div[3]/div/div[2]/div/a/span").click();*/
		f1.findElementByXPath("//span[@class='gb_ab gbii']").click();
		f1.findElementById("gb_71").click();
	}

}
