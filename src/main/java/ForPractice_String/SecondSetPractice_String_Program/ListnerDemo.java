package ForPractice_String.SecondSetPractice_String_Program;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerDemo implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+"Test is start...");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+"Test is successfuly executed.....");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+"Test is fail due to throwing some exception");
	}
	/*public void OnTestSkipped(ITestResult result) {
		System.out.println(result.getName()+"Test is skipped.....");
	}
	/*public void OnTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println(result.getName()+"Test Failed percentage....");
	}
	public void OnTestFinish(ITestResult result) {
		System.out.println(result.getName()+"Test is finished.....");
	}*/
}
