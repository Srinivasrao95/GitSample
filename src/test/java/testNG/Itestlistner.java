package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Itestlistner implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(" ontestStart");
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(" On Test Success");
    }
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println(" On Test Failure");
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println(" On Test Skipped");
    }




}
