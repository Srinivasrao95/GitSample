package pract_Extentreports;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentPart2 {

	public static void main(String[] args) throws IOException {

		ExtentReports extentreport=new ExtentReports();
		ExtentSparkReporter sparkreporter=new ExtentSparkReporter("Report1.html");
		ExtentSparkReporter sparkreporterFailedTestcases=new ExtentSparkReporter("Report2.html");
		sparkreporterFailedTestcases.filter().statusFilter().as(new Status[] {Status.FAIL}).apply();
		extentreport.attachReporter(sparkreporter,sparkreporterFailedTestcases);
		extentreport.
		createTest("Test3").
		log(Status.INFO, "<b>test3 is SIT</b>");
		
		extentreport.createTest("Test4").log(Status.INFO, "<b><i>Test4 is QA2</b></i>");
		extentreport.createTest("Highlighted test")
		.log(Status.FAIL, MarkupHelper.createLabel("This is a Highlited Message I am Srinivas", ExtentColor.CYAN));
		
		try {
			int i=5/0;
		}
		catch(Exception e) {
			extentreport.createTest("Exception1").info(e);
		}
		
		extentreport.flush();
		Desktop.getDesktop().browse(new File("Report1.html").toURI());
		Desktop.getDesktop().browse(new File("Report2.html").toURI());

	}

}
