package pract_Extentreports;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentPart1 {

	public static void main(String[] args) throws IOException {

		ExtentReports extentReports=new ExtentReports();
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter("./reports/extentreport.html");
		extentReports.attachReporter(sparkReporter);

		ExtentTest test1=extentReports.createTest("Test 1");
		test1.pass("This is passed");

		ExtentTest Test2 =extentReports.createTest("Test 2");
		Test2.log(Status.FAIL,"This is Failed");

		extentReports.createTest("This is test 3").log(Status.SKIP,"This is Skipped");

		extentReports.flush();
        Desktop.getDesktop().browse(new File("reports/extentreport.html").toURI());

	}

}
