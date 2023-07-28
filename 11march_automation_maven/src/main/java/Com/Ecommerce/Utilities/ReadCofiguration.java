package Com.Ecommerce.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadCofiguration {

	Properties pro ;
	public  ReadCofiguration() {
		File src = new File("C:\\Users\\Mayuri\\eclipse-workspace\\11march_automation_maven\\Configuration\\Config.properties");
		pro = new Properties();
		
		try {
			FileInputStream file = new FileInputStream(src);
			try {
			
				pro.load(file);
			
			}catch(IOException e) {
				e.printStackTrace();
			}
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
		public String getApplicationURL() {
			String URL =pro.getProperty("BaseURL");
			return URL;
		}
		public String Username() {
			String Username =pro.getProperty("Username");
			return Username;
		}
		public String password() {
			String Password =pro.getProperty("Password");
			return Password;
		}
		public String getChromePath() {
			String chromepath =pro.getProperty("Chromedriver");
			return chromepath;
		}
	}
	
	

