package Com.Ecommerce.Utilities;


	import java.text.SimpleDateFormat;
	import java.util.Date;

	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

	public class ExtentReportsNG {

		static ExtentReports extents;
			
		public static ExtentReports getReportObject() {
			
			String Timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
					
			String Name = "ExtentReport --"+Timestamp;
			
			//String Path = System.getProperty(""+Name+" "+".html");
			String Path = System.getProperty("user.dir")+"//Reports//"+Name+" "+".html";
			
			ExtentHtmlReporter reporter =new ExtentHtmlReporter(Path);
			
			reporter.config().setReportName("Maven_practice1");
			reporter.config().setDocumentTitle("Maven_practice1");

			extents= new ExtentReports();
			
			extents.attachReporter(reporter);
			
			extents.setSystemInfo("QA Automation engineer", "Mayuri Palimkar");
			extents.setSystemInfo("Suite Name", "Regression/Smoke");

	       return extents;
		
		}
		
	}



