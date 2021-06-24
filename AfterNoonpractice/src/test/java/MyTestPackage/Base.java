package MyTestPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{
	static WebDriver driver =null;
	public static void intialisation()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\bhushan\\Drivers File\\chromedriver_win32 (1)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
	}
	public static void fail() 
	{
		try {
		File filename=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(filename, new File("D:\\bhushan\\Selenium workspace\\AfterNoonpractice\\src\\test\\java\\MyTestPackage\\bhushan.jpg"));
		}
		catch(Exception e)
		{
			
		}
		}
		
}
