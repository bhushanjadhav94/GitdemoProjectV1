package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailtestLoop implements IRetryAnalyzer
{
	int count =0;
	int repeat=1;
	public boolean retry(ITestResult result)
	{
		if(count<repeat)
		{
			System.out.println("hi");
			count++;
			return true;
		}
		return false;
	}

}
