package Analyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class transform implements IAnnotationTransformer,ITestListener
{

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(FailtestLoop.class);
	}

	public void onTestStart(ITestResult result) {
		System.out.println("in onTestStart method");
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("in onTestSuccess method");
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("in onTestFailure method");
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("in onTestSkipped method");
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("in onTestFailedButWithinSuccessPercentage method");
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		System.out.println("in onStart method");
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("in onFinish method");
		// TODO Auto-generated method stub
		
	}

}
