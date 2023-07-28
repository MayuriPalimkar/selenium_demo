package Com.Ecommerce.Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class facebook_readconfig {

	Properties pro ;
	
	public facebook_readconfig() {
		File src = new File("C:\\Users\\Mayuri\\eclipse-workspace\\maven_framework\\Configuration\\facebookconfig.properties");
		pro=new Properties();
		
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
	
	public String getapplicationURL() {
	String URL=	pro.getProperty("BaseURL");
	return URL;
	}
	
	public String Username() {
		String email=	pro.getProperty("Username");
		return email;
		}
	public String pass() {
		String Password=	pro.getProperty("Password");
		return Password;
		}
	
	public String getChromePath() {
		String Chromepath=	pro.getProperty("Chromdriver");
		return Chromepath;
		}
}
