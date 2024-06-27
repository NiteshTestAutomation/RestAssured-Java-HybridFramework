package api.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {
	
	Properties properties;
	
	String filePath = "/test/resources/config.properties";
	
	public ReadConfigFile()
	{
		properties = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(filePath);
			properties.load(fis);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
