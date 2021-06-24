package MyTestPackage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListener.class)
public class TakesScreenshot extends Base
{
	
	@BeforeMethod
	public void URL()
	{
		intialisation();
	}
	@Test
	public void failtestcase()
	{
		Assert.assertEquals(false, true);
	}
	@AfterMethod
	public void DistroyDriver()
	{
		driver.quit();
	}
}
