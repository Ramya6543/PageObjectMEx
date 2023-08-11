package PageObjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {

	static String filePath ="C:\\SelAutomation\\PageObjectModal\\testData.properties" ;
	static Properties prop = new Properties();
	 static FileInputStream fis;

	static String URL ;
	static String UN ;	
	static String PD ;	
	static String INVPD;
	static String INVUN;
	
	public ReadProperty() throws FileNotFoundException
	{
		fis = new FileInputStream(filePath);
	}
		
	static public String getURL() throws IOException 
		
		{
		prop.load(fis);
		URL = prop.getProperty("URL");
		System.out.println(URL);	
		return URL;			
		}
		
		static public String getUN() throws IOException 
		{
		prop.load(fis);
		UN = prop.getProperty("UN");
	
		return UN;		
		}
		
		static public String getINVUN() throws IOException 
		{
		prop.load(fis);
		INVUN = prop.getProperty("INVUN");
		return INVUN;		
		}
		
		static public String getPD() throws IOException 
		{
		prop.load(fis);
		PD = prop.getProperty("PD");
		return PD;		
		}
	
		static public String getINVPD() throws IOException 
		{
		prop.load(fis);
		INVPD = prop.getProperty("INVPD");
		return INVPD;		
		}
	
	
}
